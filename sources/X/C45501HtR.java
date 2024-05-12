package X;

import Y.ACListenerS27S0100000_7;
import Y.IDBReceiverS7S0100000_7;
import Y.IDcS9S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: X.HtR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45501HtR extends AbstractC45488HtE implements InterfaceC45648Hvo {
    public TextView LLIIIZ;
    public ViewGroup LLIIJI;
    public Drawable LLIIJLIL;
    public ViewGroup LLIIL;
    public ImageView LLIILII;
    public C45465Hsr LLIIZ;
    public boolean LLIL;
    public View LLILIL;
    public ACListenerS27S0100000_7 LLILL;
    public C45527Htr LLILLIZIL;
    public boolean LLIILZL = true;
    public final long LLILII = C44529Hdl.LIZIZ();
    public final C62822Ol8 LLILLJJLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 472));
    public final C62822Ol8 LLILLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 471));
    public boolean LLILZ = true;
    public final IDBReceiverS7S0100000_7 LLILZIL = new IDBReceiverS7S0100000_7(this, 1);

    @Override // X.AbstractC45488HtE
    public final void LLJJJIL() {
        this.LJZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C45597Huz.LIZ);
    }

    @Override // X.AbstractC45656Hvw, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        Activity activity;
        super.onDestroyView();
        if (!C45623HvP.LIZ() || (activity = this.mActivity) == null) {
            return;
        }
        C10760bY.LIZ(activity).LIZLLL(this.LLILZIL);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (C78605Ut7.LIZLLL()) {
            LLJJLIIIJLLLLLLLZ(true);
            C45527Htr c45527Htr = this.LLILLIZIL;
            if (c45527Htr != null) {
                c45527Htr.invoke();
                return;
            }
            return;
        }
        LLJJLIIIJLLLLLLLZ(false);
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLIIJI;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.LLIIL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            this.LLIFFJFJJ.LIZ(true);
        } else {
            ViewGroup viewGroup3 = this.LLIIJI;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            ViewGroup viewGroup4 = this.LLIIL;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            this.LLIFFJFJJ.LIZ(false);
            if (C45871HzP.LIZ() && this.LLILZ) {
                this.LLILZ = false;
                ImageView imageView = this.LLIILII;
                if (imageView != null) {
                    Context context = imageView.getContext();
                    o.LJIIIIZZ(context, "context");
                    imageView.setImageDrawable(LLJLILLLLZIIL(context));
                }
            }
        }
        this.LJLJJLL.requestLayout();
    }

    public final Drawable LLJLILLLLZIIL(Context context) {
        Drawable drawable = this.LLIIJLIL;
        if (drawable == null) {
            if (LLJJ()) {
                C33381Ss c33381Ss = new C33381Ss();
                c33381Ss.LJLIL = R.drawable.bb2;
                drawable = c33381Ss.LIZ(new ContextThemeWrapper(this.mActivity, R.style.ux));
            } else {
                C33381Ss c33381Ss2 = new C33381Ss();
                c33381Ss2.LJLIL = R.drawable.bb2;
                drawable = c33381Ss2.LIZ(context);
            }
            this.LLIIJLIL = drawable;
        }
        return drawable;
    }

    public final void LLJZIJLIL(boolean z) {
        String str;
        this.LLIILZL = z;
        C45498HtO c45498HtO = this.LJLJI;
        if (c45498HtO != null) {
            c45498HtO.LLIIJI(z);
        }
        if (this.mActivity != null) {
            HMV hmv = (HMV) this.LLILLJJLI.getValue();
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
        C45498HtO c45498HtO = new C45498HtO(this.mActivity, this.LJLILLLLZI, d, 3, this.LJZI);
        this.LJLJI = c45498HtO;
        c45498HtO.LJZL = this.LLIIII;
        c45498HtO.LL = this.LLIIIILZ;
        c45498HtO.LLD = this.LLIIIJ;
        c45498HtO.LLF = this.LL;
        c45498HtO.LLIIJI(this.LLIILZL);
        C45498HtO c45498HtO2 = this.LJLJI;
        c45498HtO2.LJLLJ = true;
        c45498HtO2.LJLLI = this.LLIIZ;
        List<InterfaceC45547HuB> list = this.LLFII;
        if (list != null) {
            c45498HtO2.LLIIIILZ = list;
            c45498HtO2.LLIIIL = ((ArrayList) list).size();
        }
        this.LJLJI.LJLL = new C45502HtS(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJLILLLLZI);
        wrapGridLayoutManager.LLIILII = new IDcS9S0200000_7(wrapGridLayoutManager, this, 2);
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
        c45498HtO4.LJLJJI = LLJILJILJ();
        C45498HtO c45498HtO5 = this.LJLJI;
        int i = this.LLFZ;
        int i2 = this.LLI;
        c45498HtO5.LJLILLLLZI = i;
        c45498HtO5.LJLJI = i2;
        LLJJIJIL(1007);
        if (this.LJLLILLLL) {
            C45498HtO c45498HtO6 = this.LJLJI;
            c45498HtO6.LJLLLLLL.addAll(this.LJLLL);
        }
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
        LLJILJIL(1007);
        if (list.isEmpty()) {
            TextView textView = this.LLIIIZ;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.LLIIIZ;
                if (textView2 != null) {
                    textView2.setText(R.string.dhr);
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
        long currentTimeMillis = System.currentTimeMillis();
        Long onCreateViewTime = this.LJLLLL;
        o.LJIIIIZZ(onCreateViewTime, "onCreateViewTime");
        long longValue = currentTimeMillis - onCreateViewTime.longValue();
        int size = list.size();
        if (C44980Hl2.LIZ()) {
            C10K.LIZJ(new CallableC45537Hu1(this, longValue, size));
        } else {
            LLJLL(size, longValue);
        }
    }

    public final void LLJLL(int i, long j) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(0, "type");
        c145995oB.LIZ(i, "count");
        c145995oB.LJI("shoot_way", this.LLD);
        GXR.LIZ("tool_performance_fetch_album_assets", c145995oB.LIZ);
    }

    public final void LLJLLL(View view, MyMediaModel myMediaModel) {
        if (myMediaModel == null || view == null) {
            return;
        }
        if (myMediaModel.LJI()) {
            if (this.LLIL) {
                return;
            }
            this.LLIL = true;
            LLJLIL(true, myMediaModel, -1, new AqS96S0300000_7(this, myMediaModel, view, 19));
            return;
        }
        ChooseMediaExtensionKt.LIZIZ(null, myMediaModel);
        C45465Hsr c45465Hsr = this.LLIIZ;
        if (c45465Hsr == null) {
            return;
        }
        c45465Hsr.LIZLLL(myMediaModel, view);
        this.LLIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        ViewGroup viewGroup;
        Activity activity;
        int i;
        Activity activity2;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        InterfaceC36571c5 currentScene = C60903NvH.LJIIJJI().LJIL().getCurrentScene(requireActivity());
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
        ((HMV) this.LLILLJJLI.getValue()).setEnterFrom("enter_from_multi");
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 instanceof C45719Hwx) {
            o.LJII(recyclerView2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((C45719Hwx) recyclerView2).setFastScrollEnabled(true);
            RecyclerView recyclerView3 = this.LJLJJI;
            o.LJII(recyclerView3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            ((C45719Hwx) recyclerView3).setFastScrollListener(this.LLIIIL);
        }
        this.LLIIJI = (ViewGroup) this.LJLJJLL.findViewById(R.id.h1r);
        if (!C44980Hl2.LIZ() && (activity2 = this.mActivity) != null) {
            this.LLIIJLIL = LLJLILLLLZIIL(activity2);
        }
        TextView textView = (TextView) this.LJLJJLL.findViewById(R.id.lv8);
        int i2 = -1;
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
                i2 = LJI2.intValue();
            }
            textView2.setTextColor(i2);
        }
        ImageView imageView = (ImageView) this.LJLJJLL.findViewById(R.id.hp6);
        if (imageView != null) {
            Context context3 = imageView.getContext();
            o.LJIIIIZZ(context3, "context");
            imageView.setImageDrawable(LLJLILLLLZIIL(context3));
        } else {
            imageView = null;
        }
        this.LLIILII = imageView;
        this.LLIIL = (ViewGroup) this.LJLJJLL.findViewById(R.id.e2i);
        View findViewById2 = this.LJLJJLL.findViewById(R.id.ixq);
        this.LLILIL = findViewById2;
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(this.LLILL, findViewById2);
        }
        LLJJLIIIJLLLLLLLZ(C78605Ut7.LIZLLL());
        if (C45623HvP.LIZ() && (activity = this.mActivity) != null) {
            C10760bY.LIZ(activity).LIZIZ(this.LLILZIL, new IntentFilter("action-auto-test-select-media"));
        }
        ViewGroup rootView = this.LJLJJLL;
        o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }

    public final void LLJLIL(boolean z, MediaModel mediaModel, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        long j;
        boolean z2;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLILII;
        }
        HMV hmv = (HMV) this.LLILLJJLI.getValue();
        boolean LJ = C42117Gfx.LJ();
        long j2 = i;
        if (this.LLIIII != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        HMW.LIZIZ(hmv, mediaModel, LJ, j, j2, z2, false, new AqS30S1300000_7(mediaModel, (MediaModel) this, (C45501HtR) str, (String) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 4), new AqS9S1201000_7(mediaModel, this, str, i, 0), 32);
    }

    public static final void LLJLLIL(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
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
