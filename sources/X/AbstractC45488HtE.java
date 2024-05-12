package X;

import X.C42279GiZ;
import Y.ARunnableS11S0101000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HtE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45488HtE extends AbstractC45602Hv4 {
    public C45498HtO LJLJI;
    public RecyclerView LJLJJI;
    public C45462Hso LJLJJL;
    public ViewGroup LJLJJLL;
    public TextView LJLJL;
    public C8ID LJLJLJ;
    public int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public final List<String> LJLLL;
    public Long LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public C45519Htj LL;
    public String LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public List<InterfaceC45547HuB> LLFII;
    public int LLFZ;
    public int LLI;
    public C45484HtA LLIFFJFJJ;
    public final int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public MvChoosePhotoScene LLIIIL;
    public int LJLILLLLZI = 4;
    public boolean LJLJLLL = true;

    public abstract void LLJJIII(List<MyMediaModel> list, boolean z);

    public abstract void LLJJJIL();

    public final String LLJILJILJ() {
        int i;
        if (!this.LJZL) {
            return "";
        }
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        Context context = this.LJLJJLL.getContext();
        c43117Gw5.getClass();
        String LJI = C43117Gw5.LJI(context);
        if (this.LL.LJFF.stickerMultiPhotosMode) {
            return getString(R.string.e8n, Integer.valueOf(this.LJLLI));
        }
        int i2 = this.LJLLJ;
        if (i2 == 1 || i2 == 21 || i2 == 10 || (i = this.LLIIII) == 16 || i == 25) {
            return C16880lQ.LLLZ(getString(R.string.e8n), new Object[]{Integer.valueOf(this.LJLLI)});
        }
        if (i2 == 20 || i2 == 24 || i2 == 29) {
            return C16880lQ.LLLZ(getString(R.string.rh6), new Object[]{Integer.valueOf(this.LJLLI)});
        }
        if (i2 == 18) {
            return getResources().getString(R.string.s_5);
        }
        if (i2 == 19 || i2 == 21) {
            return C16880lQ.LLLZ(getString(R.string.e8n), new Object[]{1});
        }
        if (!C45771Hxn.LIZIZ) {
            return LJI;
        }
        return C43117Gw5.LJI(this.LJLJJLL.getContext());
    }

    public final boolean LLJJ() {
        if (this.LLF || this.LLFF || "story".equals(this.LLD) || this.LLFFF) {
            return true;
        }
        return false;
    }

    public final void LLJJIJI() {
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LLIIIJ();
        }
    }

    public final void LLJJJ() {
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LLFZ();
        }
    }

    public final void LLJJJJ() {
        C45737HxF c45737HxF;
        View view;
        RecyclerView recyclerView = this.LJLJJI;
        if ((recyclerView instanceof C45719Hwx) && (c45737HxF = ((C45719Hwx) recyclerView).LLLF) != null && (view = c45737HxF.LJLJLLL) != null && view.getVisibility() == 0 && c45737HxF.LJLJLLL != null) {
            c45737HxF.getHandler().removeCallbacks(c45737HxF.LJLLL);
            c45737HxF.LJLJLLL.setVisibility(8);
        }
    }

    public AbstractC45488HtE() {
        C43117Gw5.LIZ.getClass();
        this.LJLL = C43117Gw5.LJII();
        this.LJLLI = C43117Gw5.LJII();
        this.LJLLL = new ArrayList();
        this.LJLLLL = 0L;
        this.LJLLLLLL = false;
        this.LJLZ = false;
        this.LJZ = false;
        this.LJZI = false;
        this.LJZL = true;
        this.LL = new C45519Htj();
        this.LLD = "";
        this.LLF = false;
        this.LLFF = false;
        this.LLFFF = false;
        this.LLFZ = C43117Gw5.LJII();
        this.LLI = C43117Gw5.LJII();
        this.LLIFFJFJJ = null;
        this.LLII = C32151Nz.LJIILLIIL(2);
        this.LLIIII = -1;
        this.LLIIIILZ = -1;
        this.LLIIIJ = -1;
    }

    public final void LLJILJIL(int i) {
        C8ID c8id = this.LJLJLJ;
        if (c8id != null) {
            this.LJLJLLL = false;
            if (c8id.getVisibility() == 0) {
                this.LJLJLJ.setVisibility(8);
                C42303Gix.LIZ(i, GGO.DISMISS, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
            }
        }
    }

    public final void LLJJIJIIJIL(int i) {
        this.LJLLI = i;
        this.LJLL = i;
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LJLIL = i;
        }
    }

    public final void LLJJIJIL(int i) {
        if (this.LJLJLJ != null) {
            if (C41028G8i.LIZ()) {
                this.LJLJLLL = true;
                Lifecycle lifecycle = getLifecycle();
                long LIZ = C42279GiZ.LIZ();
                final ARunnableS11S0101000_7 aRunnableS11S0101000_7 = new ARunnableS11S0101000_7(i, this, 8);
                o.LJIIIZ(lifecycle, "lifecycle");
                if (LIZ <= 0) {
                    LIZ = C42301Giv.LIZ();
                }
                C42279GiZ.LIZJ.postDelayed(aRunnableS11S0101000_7, LIZ);
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.tools.view.uikit.factory.CreativeLoadingDialogFactory$sendDelayTaskForShowLoading$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        C42279GiZ.LIZJ.removeCallbacks(aRunnableS11S0101000_7);
                    }
                });
                return;
            }
            this.LJLJLJ.setVisibility(0);
            C42303Gix.LIZ(i, GGO.SHOW, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
        }
    }

    public final void LLJJL(int i) {
        this.LJLL = i;
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LJLIL = i;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLLLLLL = true;
        if (this.LJLZ && !this.LJZ) {
            LLJJJIL();
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getParcelable("PREVIEW_CONFIG") != null) {
            this.LL = (C45519Htj) this.mArguments.getParcelable("PREVIEW_CONFIG");
        }
    }

    @Override // X.AbstractC45656Hvw, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.LLD = bundle2.getString("shoot_way", "");
            this.LLF = bundle2.getBoolean("is_ugc_template_from_anchor", false);
            this.LLFF = bundle2.getBoolean("is_from_upload_tab", false);
            this.LLFFF = bundle2.getBoolean("enable_story_layout", false);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public void setUserVisibleHint(boolean z) {
        C164066cE c164066cE;
        super.setUserVisibleHint(z);
        this.LJLZ = z;
        if (this.LJLLLLLL && !this.LJZ) {
            LLJJJIL();
        }
        if (this.LJZ) {
            C45498HtO c45498HtO = this.LJLJI;
            boolean z2 = !z;
            c45498HtO.LLI = true;
            if (!e1.LIZ(31744, "creative_tools_release_img_request", true, false) || c45498HtO.LJZ == null) {
                return;
            }
            for (int i = c45498HtO.LLIIIL; i < c45498HtO.LJZ.getChildCount(); i++) {
                RecyclerView recyclerView = c45498HtO.LJZ;
                C45507HtX c45507HtX = (C45507HtX) recyclerView.LJJJJJL(recyclerView.getChildAt(i));
                if (!c45498HtO.LLFFF.contains(c45507HtX)) {
                    if (z2 && (c164066cE = c45507HtX.LJLIL) != null) {
                        c164066cE.setController(null);
                    } else {
                        c45498HtO.LJLZ(c45507HtX, -1);
                    }
                }
            }
        }
    }

    public final void LLJJI(MyMediaModel myMediaModel, boolean z) {
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            if (z) {
                if (myMediaModel != null) {
                    if (!((ArrayList) c45498HtO.LJLJJLL).contains(myMediaModel)) {
                        ((ArrayList) c45498HtO.LJLJJLL).add(myMediaModel);
                    }
                    c45498HtO.LLFZ();
                    return;
                }
                return;
            }
            if (myMediaModel == null) {
                return;
            }
            ((ArrayList) c45498HtO.LJLJJLL).remove(myMediaModel);
            c45498HtO.LLFZ();
        }
    }

    @Override // X.AbstractC45656Hvw, X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLLLL = Long.valueOf(System.currentTimeMillis());
        super.onViewCreated(view, bundle);
    }
}
