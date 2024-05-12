package X;

import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class STQ implements InterfaceC72136SSu {
    public final C62822Ol8 LJLIL;
    public ResponseQuickGenerate aigcResult;
    public final InterfaceC70422pa coroutineScope;
    public final List<STO> listenerList;

    @Override // X.InterfaceC72136SSu
    public abstract /* synthetic */ void start();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String, java.lang.Integer] */
    public final void LIZ() {
        List<String> list;
        int i;
        String str;
        int i2;
        String str2;
        ST6 st6;
        ResponseQuickGenerate responseQuickGenerate = this.aigcResult;
        CancellationException cancellationException = null;
        if (responseQuickGenerate != null) {
            list = responseQuickGenerate.avatarUrls;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            for (STO sto : this.listenerList) {
                ((InterfaceC79150V4o) this.LJLIL.getValue()).LIZIZ(null);
                STF stf = STF.FAIL;
                ResponseQuickGenerate responseQuickGenerate2 = this.aigcResult;
                if (responseQuickGenerate2 != null) {
                    i = responseQuickGenerate2.status_code;
                } else {
                    i = -1;
                }
                if (responseQuickGenerate2 != null) {
                    str = responseQuickGenerate2.status_msg;
                } else {
                    str = null;
                }
                sto.onUpdate(new ST8(stf, i, null, str, null, 0, null, null, null, 384));
            }
            return;
        }
        for (STO sto2 : this.listenerList) {
            ((InterfaceC79150V4o) this.LJLIL.getValue()).LIZIZ(cancellationException);
            STF stf2 = STF.SUCCESS;
            ResponseQuickGenerate responseQuickGenerate3 = this.aigcResult;
            if (responseQuickGenerate3 != null) {
                i2 = responseQuickGenerate3.status_code;
                str2 = responseQuickGenerate3.status_msg;
            } else {
                i2 = -1;
                str2 = cancellationException;
            }
            ResponseQuickGenerate responseQuickGenerate4 = this.aigcResult;
            if (responseQuickGenerate4 != null) {
                st6 = responseQuickGenerate4.LJ();
            } else {
                st6 = cancellationException;
            }
            ?? r8 = cancellationException;
            sto2.onUpdate(new ST8(stf2, i2, str2, r8, r8, 100, st6, "fast", r8, 256));
            cancellationException = r8;
        }
    }

    public STQ(AIGCApi api) {
        o.LJIIIZ(api, "api");
        this.listenerList = new ArrayList();
        this.coroutineScope = C48841JEv.LIZ(C78613UtF.LIZJ);
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1280));
    }

    @Override // X.InterfaceC72136SSu
    public void registerListener(STO listener) {
        ST6 st6;
        o.LJIIIZ(listener, "listener");
        this.listenerList.add(listener);
        ResponseQuickGenerate responseQuickGenerate = this.aigcResult;
        if (responseQuickGenerate != null) {
            STF stf = STF.SUCCESS;
            int i = responseQuickGenerate.status_code;
            String str = responseQuickGenerate.status_msg;
            ResponseQuickGenerate responseQuickGenerate2 = this.aigcResult;
            if (responseQuickGenerate2 != null) {
                st6 = responseQuickGenerate2.LJ();
            } else {
                st6 = null;
            }
            listener.onUpdate(new ST8(stf, i, str, null, null, 100, st6, null, null, 384));
        }
    }

    @Override // X.InterfaceC72136SSu
    public void unregisterListener(STO listener) {
        o.LJIIIZ(listener, "listener");
        this.listenerList.remove(listener);
    }
}
