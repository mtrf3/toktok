package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OW extends C6OX {
    public final Context LJIIJ;
    public final TextStickerModel LJIIJJI;
    public final FrameLayout LJIIL;
    public final C159636Oh LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final C160056Px LJIILL;
    public final InterfaceC159886Pg LJIILLIIL;
    public final C6O5 LJIIZILJ;
    public final NLEEditor LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C62822Ol8 LJIJJLI;

    @Override // X.C6OX
    public final void LJJIJIIJI(FrameLayout frameLayout) {
        throw null;
    }

    public final C1NS<TextStickerModel> LJJIZ() {
        return (C1NS) this.LJIJI.getValue();
    }

    @Override // X.C6QO
    public final StickerModel LIZ() {
        return LJJIZ().LJ;
    }

    @Override // X.C6OX, X.C6QO
    public final boolean LJFF() {
        if (super.LJFF() && !u.LJIL(LJJIZ().LJ)) {
            return true;
        }
        return false;
    }

    @Override // X.C6OX, X.C6QO
    public final boolean LJIIJ() {
        if (super.LJIIJ() && !u.LJIL(LJJIZ().LJ)) {
            return true;
        }
        return false;
    }

    @Override // X.C6OX, X.C6QO
    public final Integer LJIILL() {
        TTSModel ttsModel;
        if (!u.LJIILL(LJJIZ().LJ) || (ttsModel = LJJIZ().LJ.getTtsModel()) == null) {
            return null;
        }
        return Integer.valueOf(ttsModel.audioTrackDuration);
    }

    @Override // X.C6OX
    public final C6SD LJJIIZI() {
        if (u.LJIL(LJJIZ().LJ)) {
            Context context = this.LJIIJ;
            C1NS<TextStickerModel> LJJIZ = LJJIZ();
            C1NS<BaseStickerModel> LJJ = LJJ();
            View LJJIJIL = LJJIJIL();
            o.LJII(LJJIJIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker.core.text.view.TextGuideView");
            return new C159786Ow(context, LJJIZ, LJJ, (C159376Nh) LJJIJIL, this.LJIILL);
        }
        final Context context2 = this.LJIIJ;
        final C1NS<TextStickerModel> LJJIZ2 = LJJIZ();
        final C1NS<BaseStickerModel> LJJ2 = LJJ();
        final C160056Px c160056Px = this.LJIILL;
        return new C6SD(context2, LJJIZ2, LJJ2, c160056Px) { // from class: X.6Ov
            public final Context LJII;
            public final C08610Vl<TextStickerModel> LJIIIIZZ;
            public final C1NS<BaseStickerModel> LJIIIZ;
            public final C160056Px LJIIJ;

            @Override // X.C6SD
            public final boolean LJJIII() {
                if (((C6QI) this.LJIIJ.LIZIZ(C65352Pkq.LIZ(C6QI.class))).LIZIZ().LJIJ().LJ.LIZIZ && u.LJIJ(this.LJIIIIZZ.LJ)) {
                    return false;
                }
                return this.LJIIIZ.LJ.getVisible();
            }

            @Override // X.C6SD
            public final C1NS<BaseStickerModel> LJJII() {
                return this.LJIIIZ;
            }

            @Override // X.C6SD, X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent e) {
                o.LJIIIZ(e, "e");
                if (!LJJIII()) {
                    return false;
                }
                RectF visibleRectWithoutRotation = this.LJIIIZ.LJ.getVisibleRectWithoutRotation();
                if (this.LJIIIIZZ.LJ.getMode() != 2 && this.LJIIIIZZ.LJ.getMode() != 3) {
                    int LIZIZ = (int) C74275TDb.LIZIZ(this.LJII, 12.0f);
                    int LIZIZ2 = (int) C74275TDb.LIZIZ(this.LJII, 8.0f);
                    BaseStickerModel baseStickerModel = this.LJIIIZ.LJ;
                    visibleRectWithoutRotation = BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, baseStickerModel.getWidth() - (LIZIZ * 2), this.LJIIIZ.LJ.getHeight() - (LIZIZ2 * 2), 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -385, null).getVisibleRectWithoutRotation();
                }
                if (!C77119UOl.LJIILL(e.getX(), e.getY(), visibleRectWithoutRotation, this.LJIIIZ.LJ.getRotation())) {
                    return false;
                }
                Iterator<C6SJ> it = this.LIZJ.iterator();
                while (it.hasNext()) {
                    if (it.next().LJIILJJIL(e.getX(), e.getY(), this.LJIIIZ.LJ.getId(), new RectF(visibleRectWithoutRotation), this.LJIIIZ.LJ.getType())) {
                        return true;
                    }
                }
                Iterator<C6SE> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIILLIIL(this.LJIIIZ.LJ.getId(), this.LJIIIZ.LJ.getType(), e.getX(), e.getY(), new RectF(visibleRectWithoutRotation), this.LJIIIZ.LJ.getRotation());
                }
                return true;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(LJJ2);
                o.LJIIIZ(context2, "context");
                o.LJIIIZ(LJJIZ2, "textStateContainer");
                o.LJIIIZ(LJJ2, "stateContainer");
                o.LJIIIZ(c160056Px, "stickerObjectContainer");
                this.LJII = context2;
                this.LJIIIIZZ = LJJIZ2;
                this.LJIIIZ = LJJ2;
                this.LJIIJ = c160056Px;
            }
        };
    }

    @Override // X.C6OX
    public final void LJJIJ() {
        super.LJJIJ();
        LJJ().LIZ(new TBT() { // from class: X.6Ny
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }).LJIIIIZZ(this.LJIILJJIL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 446));
    }

    @Override // X.C6OX
    public final View LJJIJIL() {
        if (u.LJIL(LJJIZ().LJ)) {
            return (View) this.LJIJJLI.getValue();
        }
        return (View) this.LJIJJ.getValue();
    }

    @Override // X.C6OX
    public final LifecycleOwner LJJII() {
        return this.LJIILJJIL;
    }

    @Override // X.C6OX
    public final C159636Oh LJJIIJ() {
        return this.LJIILIIL;
    }

    @Override // X.C6OX, X.C6QO
    public final void LJI(StickerModel stickerModel) {
        TextStickerModel textStickerModel;
        o.LJIIIZ(stickerModel, "stickerModel");
        if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null) {
            LJJIZ().LJ(new AqS168S0100000_2(textStickerModel, 448));
            LJJIL(((TextStickerModel) stickerModel).getBaseStickerModel());
        }
        super.LJI(stickerModel);
        ((View) this.LJIJJ.getValue()).post(new ARunnableS38S0100000_2(this, 135));
    }

    @Override // X.C6OX
    public final void LJJIJIIJIL(BaseStickerModel baseState) {
        o.LJIIIZ(baseState, "baseState");
        LJJIZ().LJ(new AqS168S0100000_2(baseState, 447));
    }

    @Override // X.C6QO
    public final void setAlpha(float f) {
        LJJ().LJ(new AqS0S0000001_2(f, 8));
    }

    @Override // X.C6OX, X.C6QO
    public final void setVisible(boolean z) {
        LJJ().LJ(new AqS7S0010000_2(z, 41));
        LJJIZ().LJ(new AqS7S0010000_2(z, 42));
        super.setVisible(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OW(final Context context, final TextStickerModel textStickerModel, final FrameLayout stickerContainer, C159636Oh c159636Oh, final LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        super(context, textStickerModel.getBaseStickerModel(), c159636Oh, lifecycleOwner, stickerObjectContainer);
        C133765Mu c133765Mu;
        C122034qd LJI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJIIJ = context;
        this.LJIIJJI = textStickerModel;
        this.LJIIL = stickerContainer;
        this.LJIILIIL = c159636Oh;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = stickerObjectContainer;
        InterfaceC159886Pg interfaceC159886Pg = (InterfaceC159886Pg) stickerObjectContainer.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
        this.LJIILLIIL = interfaceC159886Pg;
        this.LJIIZILJ = interfaceC159886Pg.LJIIIIZZ();
        InterfaceC153045zY LIZIZ = interfaceC159886Pg.LIZIZ();
        final NLEEditor nLEEditor = (!(LIZIZ instanceof C133765Mu) || (c133765Mu = (C133765Mu) LIZIZ) == null || (LJI = c133765Mu.LJI()) == null || (nLEEditor = LJI.LJIIJ) == null) ? new NLEEditor() : nLEEditor;
        this.LJIJ = nLEEditor;
        final VESize LLILZ = interfaceC159886Pg.LIZIZ().LLILZ();
        this.LJIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 733));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS152S0100000_2(this, 734));
        this.LJIJJ = LIZIZ2;
        this.LJIJJLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 732));
        if (LJJIII().LJ.LJLLJ) {
            super.LJJIJIIJI(stickerContainer);
            final C1NS<BaseStickerModel> LJJ = LJJ();
            final C19K c19k = (C19K) LJJIJIL();
            this.LJIIIIZZ = new C5OY(nLEEditor, LLILZ, textStickerModel, context, LJJ, lifecycleOwner, c19k, stickerContainer) { // from class: X.5OX
                public final NLEEditor LJFF;
                public final LifecycleOwner LJI;
                public final View LJII;
                public final FrameLayout LJIIIIZZ;

                @Override // X.InterfaceC159596Od
                public final void destroy() {
                    NLETrackSlot LIZLLL = LIZLLL();
                    if (LIZLLL != null) {
                        NLETrack trackBySlot = this.LIZ.LJ().getTrackBySlot(LIZLLL);
                        if (trackBySlot != null) {
                            trackBySlot.LJIJJLI(LIZLLL);
                            if (trackBySlot.LJIILL().isEmpty()) {
                                this.LIZ.LJ().removeTrack(trackBySlot);
                            }
                        }
                        C1DH.LJIIIIZZ(this.LIZ);
                    }
                    C16880lQ.LJLLLL(this.LJII, this.LJIIIIZZ);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(nLEEditor, LLILZ, context, LJJ, lifecycleOwner);
                    o.LJIIIZ(nLEEditor, "nleEditor");
                    o.LJIIIZ(LLILZ, "initSize");
                    o.LJIIIZ(textStickerModel, "stickerModel");
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(LJJ, "baseStateContainer");
                    o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                    o.LJIIIZ(c19k, "stickerView");
                    o.LJIIIZ(stickerContainer, "stickerContainer");
                    this.LJFF = nLEEditor;
                    this.LJI = lifecycleOwner;
                    this.LJII = c19k;
                    this.LJIIIIZZ = stickerContainer;
                    BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
                    NLEModel LJ = nLEEditor.LJ();
                    NLETrack nLETrack = new NLETrack();
                    nLETrack.LJIL(EnumC123864ta.STICKER);
                    nLETrack.setEnable(true);
                    nLETrack.setExtra("StickerTrackType", EnumC121564ps.TEXT.name());
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    nLETrackSlot.setStartTime(baseStickerModel.getStartTime());
                    nLETrackSlot.setEndTime(LJ.getMainTrack().LJIIJJI());
                    nLETrackSlot.setLayer(LJ.getLayerMax() + 1);
                    NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                    nLESegmentTextSticker.LJIIIIZZ(textStickerModel.getTextStr());
                    nLESegmentTextSticker.LJIIIZ(new NLEStyText());
                    nLETrackSlot.LJIIL(nLESegmentTextSticker);
                    nLETrackSlot.setTransformX((baseStickerModel.getTranslateX() * 2) / LLILZ.width);
                    nLETrackSlot.setTransformY((baseStickerModel.getTranslateY() * (-2)) / LLILZ.height);
                    nLETrackSlot.setRotation(baseStickerModel.getRotation());
                    nLETrack.LIZIZ(nLETrackSlot);
                    nLEEditor.LJ().addTrack(nLETrack);
                    String uuid = nLETrackSlot.getUUID();
                    o.LJIIIIZZ(uuid, "newSlot.uuid");
                    this.LJ = uuid;
                    this.LIZJ.LIZ(new TBT() { // from class: X.5Oa
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 544));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5Oc
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 548));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5Od
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((BaseStickerModel) obj).getScale());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 551));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5OZ
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((BaseStickerModel) obj).getRotation());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 554));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5do
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((BaseStickerModel) obj).getVisible());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 577));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5Oe
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((BaseStickerModel) obj).getAlpha());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 579));
                    this.LIZJ.LIZ(new TBT() { // from class: X.5Og
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
                        }
                    }).LJIIIIZZ(this.LIZLLL, Lifecycle.State.STARTED, C134165Oi.LJLIL);
                    LJJ.LIZ(new TBT() { // from class: X.5Of
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
                        }
                    }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, C134155Oh.LJLIL);
                }
            };
            LJJIJ();
        } else {
            super.LJJIJIIJI(stickerContainer);
        }
        ((View) LIZIZ2.getValue()).post(new ARunnableS38S0100000_2(this, 135));
    }
}
