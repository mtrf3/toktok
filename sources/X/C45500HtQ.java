package X;

import Y.ACListenerS27S0100000_7;
import Y.IDcS9S0200000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS30S1300000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.AqS9S1201000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HtQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45500HtQ extends AbstractC45488HtE implements InterfaceC45648Hvo {
    public TextView LLIIIZ;
    public ViewOnClickListenerC81018Vqw LLIIJI;
    public ViewGroup LLIIJLIL;
    public ViewGroup LLIIL;
    public ImageView LLIILII;
    public V8E LLIILZL;
    public HQB LLIIZ;
    public InterfaceC45510Hta LLIL;
    public boolean LLILIL;
    public View LLILL;
    public ACListenerS27S0100000_7 LLILLIZIL;
    public C45529Htt LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILII = true;
    public long LLILLL = C44529Hdl.LIZIZ();
    public final C62822Ol8 LLILZIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 494));
    public final C62822Ol8 LLILZLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 493));
    public boolean LLIZ = true;

    @Override // X.AbstractC45488HtE
    public final void LLJJJIL() {
        this.LJZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C45599Hv1.LIZ);
    }

    public final boolean LLJLL() {
        Bundle bundle;
        if (this.LLIIII != 14 || (bundle = (Bundle) this.LLILZLL.getValue()) == null || !bundle.getBoolean("Key_replace_item", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (X.C43117Gw5.LIZLLL() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJLLIL() {
        /*
            r4 = this;
            android.os.Bundle r1 = r4.mArguments
            r3 = 1
            r2 = 0
            if (r1 == 0) goto Lf
            java.lang.String r0 = "forbid_init_multi_mode"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != r3) goto Lf
        Le:
            return r2
        Lf:
            boolean r0 = r4.LLILII
            if (r0 == 0) goto L1e
            X.Gw5 r0 = X.C43117Gw5.LIZ
            r0.getClass()
            boolean r0 = X.C43117Gw5.LIZLLL()
            if (r0 != 0) goto L2b
        L1e:
            X.Gw5 r1 = X.C43117Gw5.LIZ
            int r0 = r4.LLIIII
            r1.getClass()
            boolean r0 = X.C43117Gw5.LJ(r0, r2)
            if (r0 == 0) goto Le
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45500HtQ.LLJLLIL():boolean");
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (C78605Ut7.LIZLLL()) {
            LLJJLIIIJLLLLLLLZ(true);
            C45529Htt c45529Htt = this.LLILLJJLI;
            if (c45529Htt != null) {
                c45529Htt.invoke();
                return;
            }
            return;
        }
        LLJJLIIIJLLLLLLLZ(false);
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLIIJLIL;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.LLIIL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            this.LLIFFJFJJ.LIZ(true);
        } else {
            ViewGroup viewGroup3 = this.LLIIJLIL;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            ViewGroup viewGroup4 = this.LLIIL;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            this.LLIFFJFJJ.LIZ(false);
            if (C45871HzP.LIZ() && this.LLIZ) {
                this.LLIZ = false;
                ImageView imageView = this.LLIILII;
                if (imageView != null) {
                    imageView.setImageDrawable(this.LLIILZL);
                }
            }
        }
        this.LJLJJLL.requestLayout();
    }

    public final void LLJLILLLLZIIL(boolean z) {
        String str;
        this.LLILII = z;
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LLIIJI(z);
        }
        this.LJLLILLLL = z;
        if (this.mActivity != null) {
            HMV hmv = (HMV) this.LLILZIL.getValue();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            hmv.setEnterFrom(str);
        }
    }

    @Override // X.AbstractC45488HtE, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        double d;
        super.onActivityCreated(bundle);
        if (HOC.LIZJ() || this.LL.LJI.LIZ() == EnumC45531Htv.THREE_TO_FOUR) {
            d = 1.3333333333333333d;
        } else if (HOC.LIZLLL() || this.LL.LJI.LIZ() == EnumC45531Htv.NINE_TO_SIXTEEN) {
            d = 1.7777777777777777d;
        } else {
            d = 1.0d;
        }
        C45498HtO c45498HtO = new C45498HtO(this.mActivity, this.LJLILLLLZI, d, 1, this.LJZI);
        this.LJLJI = c45498HtO;
        c45498HtO.LJZL = this.LLIIII;
        c45498HtO.LLF = this.LL;
        c45498HtO.LL = this.LLIIIILZ;
        c45498HtO.LLD = this.LLIIIJ;
        c45498HtO.LLIIJI(this.LJLLILLLL);
        C45498HtO c45498HtO2 = this.LJLJI;
        c45498HtO2.LJLLJ = true;
        c45498HtO2.LJLLI = this.LLIL;
        c45498HtO2.LJLL = new C45503HtT(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJLILLLLZI);
        wrapGridLayoutManager.LLIILII = new IDcS9S0200000_7(wrapGridLayoutManager, this, 1);
        this.LJLJJI.setHasFixedSize(true);
        this.LJLJJI.setItemViewCacheSize(this.LJLILLLLZI);
        if (C45695HwZ.LIZ()) {
            this.LJLJJI.setItemAnimator(null);
        }
        this.LJLJJI.setLayoutManager(wrapGridLayoutManager);
        this.LJLJJI.LJII(new C45663Hw3(this.LJLILLLLZI, this.LLII, true), -1);
        C45498HtO c45498HtO3 = this.LJLJI;
        RecyclerView recyclerView = this.LJLJJI;
        c45498HtO3.LJZ = recyclerView;
        recyclerView.setAdapter(c45498HtO3);
        C45498HtO c45498HtO4 = this.LJLJI;
        c45498HtO4.LJLIL = this.LJLL;
        List<InterfaceC45547HuB> list = this.LLFII;
        if (list != null) {
            c45498HtO4.LLIIIILZ = list;
            c45498HtO4.LLIIIL = ((ArrayList) list).size();
        }
        this.LJLJI.LJLJJI = LLJILJILJ();
        C45498HtO c45498HtO5 = this.LJLJI;
        int i = this.LLFZ;
        int i2 = this.LLI;
        c45498HtO5.LJLILLLLZI = i;
        c45498HtO5.LJLJI = i2;
        LLJJIJIL(1008);
        if (this.LJLLILLLL) {
            C45498HtO c45498HtO6 = this.LJLJI;
            c45498HtO6.LJLLLLLL.addAll(this.LJLLL);
        }
        if (!LLJLLIL() || C43326GzS.LIZ() || this.LLILZ || this.LLIIII == 25 || LLJLL() || this.LLIIII == 34) {
            return;
        }
        this.LJLJI.LLIIJI(true);
        ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw = this.LLIIJI;
        if (viewOnClickListenerC81018Vqw != null) {
            viewOnClickListenerC81018Vqw.setVisibility(8);
        }
        ((HMV) this.LLILZIL.getValue()).setEnterFrom("enter_from_multi");
    }

    @Override // X.AbstractC45488HtE, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            LLJJLIIIJLLLLLLLZ(C78605Ut7.LIZLLL());
        }
    }

    @Override // X.AbstractC45488HtE
    public final void LLJJIII(List<MyMediaModel> list, boolean z) {
        if (list == null) {
            return;
        }
        LLJILJIL(1008);
        if (list.isEmpty()) {
            TextView textView = this.LLIIIZ;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.LLIIIZ;
                if (textView2 != null) {
                    textView2.setText(R.string.dhs);
                    if (this.LJZI) {
                        G8G.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                        this.LJZI = false;
                    }
                } else {
                    o.LJIJI("noVideoHintTextView");
                    throw null;
                }
            } else {
                o.LJIJI("noVideoHintTextView");
                throw null;
            }
        } else {
            TextView textView3 = this.LLIIIZ;
            if (textView3 != null) {
                textView3.setVisibility(8);
            } else {
                o.LJIJI("noVideoHintTextView");
                throw null;
            }
        }
        if (z) {
            this.LJLJI.setData(list);
        } else {
            this.LJLJI.LLIIJLIL(list);
        }
        C145995oB c145995oB = new C145995oB();
        long currentTimeMillis = System.currentTimeMillis();
        Long onCreateViewTime = this.LJLLLL;
        o.LJIIIIZZ(onCreateViewTime, "onCreateViewTime");
        c145995oB.LIZIZ(currentTimeMillis - onCreateViewTime.longValue(), "duration");
        c145995oB.LIZ(1, "type");
        c145995oB.LJI("shoot_way", this.LLD);
        c145995oB.LIZ(list.size(), "count");
        GXR.LIZ("tool_performance_fetch_album_assets", c145995oB.LIZ);
    }

    public final void LLJZIJLIL(View view, MyMediaModel myMediaModel) {
        boolean z;
        if (myMediaModel == null || view == null || this.LLILIL) {
            return;
        }
        this.LLILIL = true;
        if (C42117Gfx.LJ() && this.LLIIII != 15) {
            z = true;
        } else {
            z = false;
        }
        LLJLIL(true, z, myMediaModel, -1, new AqS96S0300000_7(this, myMediaModel, view, 17));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        ViewGroup viewGroup;
        char c;
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        InterfaceC36571c5 currentScene = C60903NvH.LJIIJJI().LJIL().getCurrentScene(requireActivity());
        int i2 = 0;
        if (C42617Go1.LIZ() && (currentScene instanceof InterfaceC45601Hv3)) {
            viewGroup = (ViewGroup) C45526Htq.LIZ((InterfaceC45601Hv3) currentScene, R.layout.dro, this);
        } else {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dro, container, false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) LLLLIILL;
        }
        this.LJLJJLL = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.dyi);
        this.LJLJJI = recyclerView;
        recyclerView.setRecycledViewPool(C45513Htd.LIZ(this));
        View findViewById = this.LJLJJLL.findViewById(R.id.m8i);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.tv_hint)");
        this.LLIIIZ = (TextView) findViewById;
        this.LJLJLJ = (C8ID) this.LJLJJLL.findViewById(R.id.n6o);
        if (this.LLILII && !this.LJLLILLLL) {
            c = 0;
        } else {
            c = '\b';
        }
        ImageView imageView = null;
        if (!LLJLLIL() && c == 0) {
            View findViewById2 = this.LJLJJLL.findViewById(R.id.nc9);
            o.LJII(findViewById2, "null cannot be cast to non-null type android.view.ViewStub");
            ((ViewStub) findViewById2).inflate();
            View findViewById3 = this.LJLJJLL.findViewById(R.id.gpg);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.multi_select_view)");
            ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw = (ViewOnClickListenerC81018Vqw) findViewById3;
            this.LLIIJI = viewOnClickListenerC81018Vqw;
            if (!this.LLILII || this.LJLLILLLL) {
                i2 = 8;
            }
            viewOnClickListenerC81018Vqw.setVisibility(i2);
            ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw2 = this.LLIIJI;
            if (viewOnClickListenerC81018Vqw2 != null) {
                viewOnClickListenerC81018Vqw2.setOnModeChangeListener(new C45512Htc(this));
            } else {
                o.LJIJI("multiSelectView");
                throw null;
            }
        }
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 instanceof C45719Hwx) {
            o.LJII(recyclerView2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((C45719Hwx) recyclerView2).setFastScrollEnabled(true);
            RecyclerView recyclerView3 = this.LJLJJI;
            o.LJII(recyclerView3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((C45719Hwx) recyclerView3).setFastScrollListener(this.LLIIIL);
        }
        this.LLIIJLIL = (ViewGroup) this.LJLJJLL.findViewById(R.id.h1r);
        TextView textView = (TextView) this.LJLJJLL.findViewById(R.id.lv8);
        int i3 = -1;
        if (textView != null && LLJJ()) {
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.cl, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = -1;
            }
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) this.LJLJJLL.findViewById(R.id.lv9);
        if (textView2 != null && LLJJ()) {
            Context context2 = textView2.getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dk, context2);
            if (LJI2 != null) {
                i3 = LJI2.intValue();
            }
            textView2.setTextColor(i3);
        }
        Context context3 = this.mActivity;
        if (context3 != null) {
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.bb2;
            if (LLJJ()) {
                context3 = new ContextThemeWrapper(context3, R.style.ux);
            }
            this.LLIILZL = c33381Ss.LIZ(context3);
        }
        ImageView imageView2 = (ImageView) this.LJLJJLL.findViewById(R.id.hp6);
        if (imageView2 != null) {
            if (!C45871HzP.LIZ()) {
                imageView2.setImageDrawable(this.LLIILZL);
            }
            imageView = imageView2;
        }
        this.LLIILII = imageView;
        this.LLIIL = (ViewGroup) this.LJLJJLL.findViewById(R.id.e2i);
        View findViewById4 = this.LJLJJLL.findViewById(R.id.ixq);
        this.LLILL = findViewById4;
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(this.LLILLIZIL, findViewById4);
        }
        LLJJLIIIJLLLLLLLZ(C78605Ut7.LIZLLL());
        ViewGroup rootView = this.LJLJJLL;
        o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }

    public final void LLJLIL(boolean z, boolean z2, MediaModel mediaModel, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        long j;
        boolean z3;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLILLL;
        }
        HMV hmv = (HMV) this.LLILZIL.getValue();
        long j2 = i;
        if (this.LLIIII != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        HMW.LIZIZ(hmv, mediaModel, z2, j, j2, z3, false, new AqS30S1300000_7(mediaModel, (MediaModel) this, (C45500HtQ) str, (String) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 5), new AqS9S1201000_7(mediaModel, this, str, i, 1), 32);
    }

    public static final void LLJLLL(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("status", String.valueOf(i));
            c6bk.LIZ.put("scene_name", str2);
            c6bk.LIZ.put("errorCode", Integer.valueOf(i2));
            c6bk.LIZ.put("type", str);
            c6bk.LIZ.put("width", Integer.valueOf(mediaModel.width));
            c6bk.LIZ.put("height", Integer.valueOf(mediaModel.height));
            C43882HKc.LIZJ("aweme_video_import_duration", jSONObject, c6bk.LJ());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
