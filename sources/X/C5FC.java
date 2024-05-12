package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5FC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FC {
    public static C5FE LIZ;
    public static C5FE LIZIZ;

    public static final C1551667c LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        C1551667c c1551667c = new C1551667c(context, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1551667c.setLayoutParams(layoutParams);
        c1551667c.setEnabled(false);
        c1551667c.setClickable(false);
        c1551667c.setFocusable(false);
        c1551667c.setFocusableInTouchMode(false);
        c1551667c.setInEdit(false);
        c1551667c.setNeedUnspecialiedMeasure(true);
        c1551667c.setUseAutoTextSize(false);
        return c1551667c;
    }

    public static final NLETrack LIZLLL(NLEModel nLEModel) {
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        if (nLEModel == null) {
            return null;
        }
        Iterator<NLETrack> it = C124574uj.LJJIIJ(nLEModel).iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (nLETrack.getLayer() == 0) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 == null) {
            return null;
        }
        if (nLETrack2.LJIILL().size() != 0 && (nLETrack2.LJIILL().size() == 0 || (nLETrackSlot = nLETrack2.LJIILL().get(0)) == null || !AnonymousClass636.LJIIL(nLETrackSlot))) {
            return null;
        }
        return nLETrack2;
    }

    public static final List<NLETrackSlot> LJFF(NLEModel nLEModel) {
        if (nLEModel == null) {
            return C61878OQg.INSTANCE;
        }
        List<NLETrack> LJIIIIZZ = LJIIIIZZ(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = LJIIIIZZ.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LJIILL());
        }
        return arrayList;
    }

    public static final List<NLETrackSlot> LJI(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        List<NLETrack> LJIIIIZZ = LJIIIIZZ(C79057V0z.LJJI(editorContext));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((NLETrack) it.next()).LJIILL());
        }
        return arrayList;
    }

    public static final int LJII(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        List<NLETrackSlot> LJI = LJI(editorContext);
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : LJI) {
            if (AnonymousClass636.LJIILL(nLETrackSlot)) {
                arrayList.add(nLETrackSlot);
            }
        }
        return arrayList.size();
    }

    public static final List<NLETrack> LJIIIIZZ(NLEModel model) {
        o.LJIIIZ(model, "model");
        List<NLETrack> LJJIFFI = C124574uj.LJJIFFI(model);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : LJJIFFI) {
            if (o.LJ(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final boolean LJIIIZ(NLEModel nLEModel) {
        NLETrack LIZLLL = LIZLLL(nLEModel);
        Integer num = null;
        if (LIZLLL != null && LIZLLL.LJIILL() != null) {
            NLETrack LIZLLL2 = LIZLLL(nLEModel);
            if (LIZLLL2 != null) {
                num = Integer.valueOf(LIZLLL2.LJIILL().size());
            }
            o.LJI(num);
            if (num.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZ(NLEModel nleModel, NLETrackSlot addedTextSlot) {
        o.LJIIIZ(nleModel, "nleModel");
        o.LJIIIZ(addedTextSlot, "addedTextSlot");
        if (LIZLLL(nleModel) == null) {
            Iterator<NLETrack> it = C124574uj.LJJIIJ(nleModel).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NLETrack next = it.next();
                if (next.getLayer() == 0) {
                    if (next != null) {
                        for (NLETimeSpaceNode nLETimeSpaceNode : ORZ.LLJILJILJ(LJIIIIZZ(nleModel))) {
                            nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
                        }
                    }
                }
            }
            NLETrack nLETrack = new NLETrack();
            C124574uj.LJJLIIIJILLIZJL(nLETrack, "sticker");
            C124574uj.LJJLI(nLETrack);
            nLETrack.setLayer(0);
            nLETrack.LJIL(EnumC123864ta.STICKER);
            nLETrack.setExtra("StickerTrackType", "TEXT");
            nLETrack.LIZIZ(addedTextSlot);
            nleModel.addTrack(nLETrack);
            return;
        }
        NLETrack LIZLLL = LIZLLL(nleModel);
        o.LJI(LIZLLL);
        LIZLLL.LIZIZ(addedTextSlot);
    }

    public static final NLETrack LIZIZ(NLEModel nleModel, NLETrackSlot addedTextSlot) {
        int i;
        o.LJIIIZ(nleModel, "nleModel");
        o.LJIIIZ(addedTextSlot, "addedTextSlot");
        NLETrack LJ = C52B.LJ(nleModel, addedTextSlot, LJIIIIZZ(nleModel), new AqS152S0100000_2(nleModel, 772));
        if (LJ != null) {
            i = LJ.getLayer();
        } else {
            i = 1;
        }
        addedTextSlot.setLayer(i);
        return LJ;
    }

    public static final NLETrackSlot LJ(String id, EditorProContext editorProContext) {
        o.LJIIIZ(id, "id");
        NLETrackSlot nLETrackSlot = null;
        if (editorProContext == null) {
            return null;
        }
        Iterator<NLETrackSlot> it = LJI(editorProContext).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NLETrackSlot next = it.next();
            if (TextUtils.equals(next.getUUID(), id)) {
                nLETrackSlot = next;
                break;
            }
        }
        return nLETrackSlot;
    }

    public static final void LJIIJ(final C1551667c c1551667c, final C5FE c5fe, final C5FE c5fe2, final boolean z, final InterfaceC65784Pro interfaceC65784Pro) {
        float f;
        if (c5fe == null || c5fe2 == null || c1551667c == null) {
            return;
        }
        float f2 = c5fe.LIZLLL % 360.0f;
        if (f2 < -180.0f && z) {
            f2 += 360.0f;
        }
        c5fe.LIZLLL = f2;
        c1551667c.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1551667c, "scaleX", c5fe.LIZJ, c5fe2.LIZJ);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c1551667c, "scaleY", c5fe.LIZJ, c5fe2.LIZJ);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c1551667c, "rotation", c5fe.LIZLLL, c5fe2.LIZLLL);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c1551667c, "translationX", c5fe.LIZ, c5fe2.LIZ);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c1551667c, "translationY", c5fe.LIZIZ, c5fe2.LIZIZ);
        float[] fArr = new float[2];
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (!z) {
            f3 = 1.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c1551667c, "alpha", fArr);
        AnimatorSet LIZ2 = C1DD.LIZ(200L);
        LIZ2.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        LIZ2.addListener(new AnimatorListenerAdapter() { // from class: X.5FD
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (z) {
                    c1551667c.setVisibility(8);
                    C5FE c5fe3 = c5fe;
                    C5FC.LIZ = c5fe2;
                    C5FC.LIZIZ = c5fe3;
                    return;
                }
                C5FC.LIZ = null;
                C5FC.LIZIZ = null;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                if (interfaceC65784Pro2 == null) {
                    return;
                }
                interfaceC65784Pro2.invoke();
            }
        });
        LIZ2.start();
    }
}
