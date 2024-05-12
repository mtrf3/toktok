package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hs9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC45421Hs9 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((View) this.LJLJI).addOnLayoutChangeListener(((CommentWidget) this.LJLILLLLZI).LLJJI);
                return;
            case 1:
                Object obj = this.LJLILLLLZI;
                Object obj2 = this.LJLJI;
                if (HWC.LIZIZ.size() > 30) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("size :");
                    LIZ.append(HWC.LIZIZ.size());
                    C79083V1z.LIZ(0, "CancellableManager", "checkSize", X1D.LIZIZ(LIZ));
                    Iterator it = ((LinkedHashMap) HWC.LIZIZ).entrySet().iterator();
                    while (it.hasNext()) {
                        HWB hwb = (HWB) ((Reference) ((Map.Entry) it.next()).getValue()).get();
                        if (hwb == null) {
                            it.remove();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("remove null cancellable:");
                            LIZ2.append(HWC.LIZIZ.size());
                            C79083V1z.LIZ(0, "CancellableManager", "checkSize", X1D.LIZIZ(LIZ2));
                        } else if (hwb.LIZJ) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("remove cancelled :");
                            LIZ3.append(HWC.LIZIZ.size());
                            C79083V1z.LIZ(0, "CancellableManager", "checkSize", X1D.LIZIZ(LIZ3));
                        }
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("after trim size :");
                    LIZ4.append(HWC.LIZIZ.size());
                    C79083V1z.LIZ(0, "CancellableManager", "checkSize", X1D.LIZIZ(LIZ4));
                }
                HWC.LIZIZ.put(obj, new WeakReference(obj2));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("[ADD]@@");
                LIZ5.append(obj.hashCode());
                LIZ5.append(" registerMainCancellable  size:");
                LIZ5.append(HWC.LIZIZ.size());
                C79083V1z.LIZ(0, "CancellableManager", X1D.LIZIZ(LIZ5), "");
                return;
            case 2:
                ((AuthorizeActivity) this.LJLILLLLZI).LLIIIJ(0, (Intent) this.LJLJI);
                R41.LJIIIZ();
                return;
            case 3:
                InstagramPresenter.LIZIZ((InstagramPresenter) this.LJLILLLLZI, (String) this.LJLJI);
                return;
            case 4:
                C45417Hs5 c45417Hs5 = (C45417Hs5) this.LJLILLLLZI;
                Context context = (Context) this.LJLJI;
                A90 a90 = c45417Hs5.LIZIZ;
                if (a90 != null) {
                    a90.dismiss();
                }
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(R.string.hvj);
                c5s1.LJ();
                FeedPanelStateViewModel feedPanelStateViewModel = c45417Hs5.LIZ;
                if (feedPanelStateViewModel != null) {
                    feedPanelStateViewModel.LJLJLLL.setValue(false);
                    return;
                }
                return;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.LJLILLLLZI;
                View view = (View) this.LJLJI;
                horizontalScrollView.getClass();
                horizontalScrollView.smoothScrollTo(((view.getRight() + view.getLeft()) / 2) - (horizontalScrollView.getWidth() / 2), 0);
                return;
        }
    }

    public /* synthetic */ RunnableC45421Hs9(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
