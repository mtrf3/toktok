package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.GsonUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ze7, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90415Ze7 implements Handler.Callback {
    public final /* synthetic */ C90416Ze8 LJLIL;

    public C90415Ze7(C90416Ze8 c90416Ze8) {
        this.LJLIL = c90416Ze8;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String projectId;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Bundle data = message.getData();
                long j = this.LJLIL.LJIIIZ;
                if (data != null) {
                    j = data.getLong("msg.key.start_check_time", j);
                }
                C90416Ze8 c90416Ze8 = this.LJLIL;
                c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "startCheckInner");
                if (c90416Ze8.LJIIJJI.isEmpty()) {
                    c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "serviceMap is empty");
                } else {
                    for (Map.Entry<String, ServiceInfo> entry : c90416Ze8.LJIIJJI.entrySet()) {
                        if (entry != null) {
                            ServiceInfo value = entry.getValue();
                            if (j != c90416Ze8.LJIIIZ) {
                                c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "before enqueue task expired, ignore this task.");
                            } else {
                                Dispatcher.getInstance().enqueue(new RunnableC90417Ze9(c90416Ze8, value, j));
                            }
                        }
                    }
                }
            }
        } else {
            C90416Ze8 c90416Ze82 = this.LJLIL;
            if (c90416Ze82.LIZ == null) {
                c90416Ze82.LIZJ.w("BDLinkServiceDiskCacheHelper", "readCacheInner context is null");
            } else {
                c90416Ze82.LIZJ.i("BDLinkServiceDiskCacheHelper", "readCacheInner");
                Context context = c90416Ze82.LIZ;
                ContextManager.CastContext castContext = c90416Ze82.LIZIZ;
                if (castContext == null) {
                    projectId = "";
                } else {
                    projectId = castContext.getProjectId();
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) GsonUtils.fromJsonIgnoreException(PreferenceUtils.getBDLinkServiceInfo(context, projectId), new C90775Zjv().getType());
                if (linkedHashMap == null) {
                    c90416Ze82.LIZJ.w("BDLinkServiceDiskCacheHelper", "readCacheInner diskCacheServiceMap is null");
                } else {
                    c90416Ze82.LJIIJJI.putAll(linkedHashMap);
                    CastLogger castLogger = c90416Ze82.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("readCacheInner serviceMap size: ");
                    LIZ.append(c90416Ze82.LJIIJJI.size());
                    castLogger.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ));
                }
            }
        }
        return true;
    }
}
