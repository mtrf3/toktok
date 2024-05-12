package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.lighten.loader.FrescoImageLoaderDelegate;
import com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SmU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C73098SmU implements InterfaceC48038ItG, InterfaceC39771FjD, V20 {
    public static HashMap LIZLLL() {
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        return hashMap;
    }

    public static C44423Hc3 LJ() {
        return C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
    }

    public static Rect LIZJ(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static boolean LJFF(Thread thread) {
        return o.LJ(thread, C16880lQ.LLJJJJ().getThread());
    }

    @Override // X.V20
    public boolean LIZ(android.net.Uri uri) {
        return FrescoImageLoaderDelegate.lambda$init$1(uri);
    }

    @Override // X.InterfaceC39771FjD
    public boolean LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Iterator<String> it = HoraeInitTask.LJLIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains(it.next())) {
                        break;
                    }
                } else {
                    List<String> list = HoraeInitTask.LJLILLLLZI;
                    if (list != null && list.size() > 0) {
                        Iterator<String> it2 = HoraeInitTask.LJLILLLLZI.iterator();
                        while (it2.hasNext()) {
                            if (str.contains(it2.next())) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseResponse) obj).data;
    }
}
