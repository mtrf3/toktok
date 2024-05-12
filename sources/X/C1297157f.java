package X;

import Y.AObserverS70S0100000_2;
import Y.IDTListenerS88S0200000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.views.InterceptorFrameLayout;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.57f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297157f extends AnonymousClass503 {
    public final C130695Az LJLIL;
    public final C58D LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final Keva LJLJJL;
    public final int LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;

    public final OSZ<Integer, Integer> LJIILJJIL() {
        C76800UCe c76800UCe;
        int[] iArr = new int[2];
        C58D c58d = this.LJLILLLLZI;
        if (c58d != null) {
            c58d.getLocationInWindow(iArr);
            c76800UCe = C76800UCe.LIZ;
        } else {
            c76800UCe = null;
        }
        if (c76800UCe == null) {
            return new OSZ<>(0, 0);
        }
        return new OSZ<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final boolean LJIILL() {
        return this.LJLJJL.getBoolean("editor_pro_transition_guide_init", false);
    }

    public final void LJIILLIIL() {
        boolean z;
        C58D c58d;
        int i;
        int i2;
        EditorProContext editorProContext = (EditorProContext) this.LJLJL.getValue();
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) C79057V0z.LJJIII(editorProContext, "has_shown_bottom_menu_anim_guide", bool)).booleanValue();
        EditModelProvider.Companion.getClass();
        AnonymousClass585 magicItemController$tools_camera_edit_release = C126784yI.LIZ().getMagicItemController$tools_camera_edit_release();
        if (magicItemController$tools_camera_edit_release != null) {
            z = magicItemController$tools_camera_edit_release.LJLJLJ;
        } else {
            z = false;
        }
        C5DC c5dc = (C5DC) this.LJLJLJ.getValue();
        if ((c5dc != null && c5dc.LJII()) || booleanValue || ((Boolean) C79057V0z.LJJIII((EditorProContext) this.LJLJL.getValue(), "event_user_guide_intercepted", bool)).booleanValue() || z) {
            return;
        }
        EditorProContext.Companion.getClass();
        if (((Boolean) C79057V0z.LJJIII(C124994vP.LIZ(), "is_bottom_panel_showing", bool)).booleanValue() || (c58d = this.LJLILLLLZI) == null || !c58d.checkFirstTransitionVisibleInSafeArea(this.LJLJJLL)) {
            return;
        }
        int intValue = LJIILJJIL().getSecond().intValue();
        int LIZJ = C134845Qy.LIZJ(this.LJLJJI);
        int intValue2 = LJIILJJIL().getSecond().intValue();
        C58D c58d2 = this.LJLILLLLZI;
        if (c58d2 != null) {
            i = c58d2.getHeight();
        } else {
            i = 0;
        }
        Rect rect = new Rect(0, intValue, LIZJ, intValue2 + i);
        int[] iArr = new int[2];
        this.LJLJI.getLocationInWindow(iArr);
        int intValue3 = ((Number) new OSZ(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])).getSecond()).intValue();
        int LIZJ2 = C134845Qy.LIZJ(this.LJLJJI);
        int[] iArr2 = new int[2];
        this.LJLJI.getLocationInWindow(iArr2);
        this.LJLIL.setOnTouchListener(new IDTListenerS88S0200000_2(rect, new Rect(0, intValue3, LIZJ2, this.LJLJI.getHeight() + ((Number) new OSZ(Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1])).getSecond()).intValue()), 4));
        OSZ<Integer, Integer> firstTransitionLocation = this.LJLILLLLZI.getFirstTransitionLocation();
        VideoPublishEditModel editModel = C126784yI.LIZ().getEditModel();
        if (editModel != null) {
            EditorProContext editorContext = (EditorProContext) this.LJLJL.getValue();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(editModel, editorContext);
            LJFF.LJI("music_id", editModel.getMusicId());
            LJFF.LJI("enter_from", editModel.enterFrom);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("add_transition_guide_show", LJFF.LIZ);
        }
        C130695Az c130695Az = this.LJLIL;
        int intValue4 = firstTransitionLocation.getFirst().intValue();
        int intValue5 = firstTransitionLocation.getSecond().intValue();
        int intValue6 = LJIILJJIL().getSecond().intValue();
        int height = this.LJLILLLLZI.getHeight() + LJIILJJIL().getSecond().intValue();
        c130695Az.getClass();
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(c130695Az.LJLJLLL);
        anonymousClass064.LJIIIZ(R.id.ljn, 3, R.id.ljm, 3, intValue5 + c130695Az.LJLJJL);
        if (((Boolean) c130695Az.LJLL.getValue()).booleanValue()) {
            i2 = ((C143205jg.LJ() - intValue4) - c130695Az.LJLJJL) - c130695Az.LJLJJI;
        } else {
            i2 = c130695Az.LJLJJL + intValue4;
        }
        anonymousClass064.LJIIIZ(R.id.ljn, 6, R.id.ljm, 6, i2);
        anonymousClass064.LIZIZ(c130695Az.LJLJLLL);
        int i3 = c130695Az.LJLJJL;
        int i4 = intValue4 + i3;
        int i5 = intValue5 + i3;
        Rect rect2 = c130695Az.LJLJJLL;
        int i6 = c130695Az.LJLJJI;
        rect2.set(i4, i5, i4 + i6, i6 + i5);
        Rect rect3 = c130695Az.LJLJL;
        Context context = c130695Az.getContext();
        o.LJIIIIZZ(context, "context");
        rect3.set(0, intValue6, C134845Qy.LIZJ(context), height);
        c130695Az.setVisibility(0);
        c130695Az.invalidate();
        Path path = new Path();
        path.moveTo(1.0f, 1.0f);
        path.lineTo(1.5f, 1.5f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c130695Az.LJLJLJ, "scaleX", "scaleY", path);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new C58T());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.start();
        this.LJLJJL.storeBoolean("editor_pro_transition_guide_init", true);
        this.LJLJLLL = true;
        C2VQ.LIZIZ(new AqS152S0100000_2(this, 757), 3000L);
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onExitEditPage(boolean z) {
        this.LJLJLLL = false;
    }

    public C1297157f(EditorProScene scene, C130695Az transitionGuideView, C58D c58d, InterceptorFrameLayout interceptorFrameLayout) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(transitionGuideView, "transitionGuideView");
        this.LJLIL = transitionGuideView;
        this.LJLILLLLZI = c58d;
        this.LJLJI = interceptorFrameLayout;
        this.LJLJJI = SceneExtensionsKt.LIZLLL(scene);
        this.LJLJJL = Keva.getRepo("transition_guide_repo");
        this.LJLJJLL = C134845Qy.LIZ(56.0f);
        this.LJLJL = C221108m2.LIZIZ(C123504t0.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C1290154n.LJLIL);
        if (!LJIILL()) {
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(scene, new AObserverS70S0100000_2(this, 235));
        }
        C5G5.LIZ(this);
    }
}
