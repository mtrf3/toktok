package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC09760Zw implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((AbstractC43481nE) this.LJLILLLLZI).LJIIJJI((C19080oy) this.LJLJI, (AbstractC19070ox) this.LJLJJI);
                return;
            case 1:
                CommentWidget commentWidget = (CommentWidget) this.LJLILLLLZI;
                String str = (String) this.LJLJI;
                CI2 ci2 = (CI2) this.LJLJJI;
                commentWidget.LLIIII = true;
                if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(str)) {
                    commentWidget.LLII(str);
                } else {
                    commentWidget.LLFZ(str);
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_comment_rethink_cg_ck");
                C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, commentWidget.dataChannel), LIZ, "user_id");
                LIZ.LJIJJ(ci2.LJIIJ, "comment");
                LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(ci2.LJIIIZ, ci2.LJIIJ) ? 1 : 0), "resend_same_cmt");
                LIZ.LJJIIJZLJL();
                return;
            default:
                C38843FMh c38843FMh = (C38843FMh) this.LJLILLLLZI;
                Callable callable = (Callable) this.LJLJI;
                Object obj = this.LJLJJI;
                c38843FMh.getClass();
                try {
                    Object call = callable.call();
                    if (call != null) {
                        ((ConcurrentHashMap) c38843FMh.LIZIZ).put(obj, call);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public /* synthetic */ RunnableC09760Zw(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
