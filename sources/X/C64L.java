package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Space;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.tiktok.sticker.commonsticker.model.OptionsBean;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.64L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64L extends AbstractC29891Fh<InterfaceC1541863i> implements InterfaceC1541863i, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC1541863i LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public String LJLJJL;
    public final C5H3 LJLJJLL;
    public C64W LJLJL;

    static {
        TBT tbt = new TBT(C64L.class, "stickerService", "getStickerService()Lcom/ss/android/ugc/aweme/tools/sticker_core/newframework/container/IStickerContainerService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    private final C6DO LJJLI() {
        C6DO c6do = new C6DO();
        c6do.LIZ = R.drawable.t9;
        c6do.LIZJ = R.string.e43;
        c6do.LJFF = new ACListenerS22S0100000_2(this, 55);
        return c6do;
    }

    private final C1559169z LJJLIIIJJI() {
        return (C1559169z) this.LJLJJLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r3.LIZJ == true) goto L6;
     */
    @Override // X.InterfaceC1541863i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tiktok.sticker.commonsticker.model.PollStickerModel E70() {
        /*
            r4 = this;
            X.64W r3 = r4.LJLJL
            if (r3 == 0) goto Lf
            boolean r1 = r3.LIZJ
            r0 = 1
            if (r1 != r0) goto Lf
        L9:
            r2 = 0
            if (r0 == 0) goto L11
            r4.LJLJL = r2
            return r2
        Lf:
            r0 = 0
            goto L9
        L11:
            if (r3 == 0) goto L27
            com.tiktok.sticker.commonsticker.model.PollStickerModel r1 = r3.LJFF
        L15:
            boolean r0 = r1 instanceof com.tiktok.sticker.commonsticker.model.PollStickerModel
            if (r0 == 0) goto L1c
            r2 = r1
            if (r1 != 0) goto L1d
        L1c:
            return r2
        L1d:
            java.lang.String r1 = r4.LJLJJL
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.stickerId = r1
            goto L1c
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64L.E70():com.tiktok.sticker.commonsticker.model.PollStickerModel");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.69v, X.69z] */
    public final C1559169z LJJLIIIIJ() {
        final Context LJJIII = C78688UuS.LJJIII(this);
        ?? r2 = new C1559169z(LJJIII) { // from class: X.69v
            public final C6A2 LJLLI;
            public final int LJLLILLLL;
            public InterfaceC65784Pro<C76800UCe> LJLLJ;
            public InterfaceC65784Pro<C76800UCe> LJLLL;

            @Override // X.C1559169z
            public final void LJI() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLLL;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }

            @Override // X.C1559169z
            public final void LJ() {
                View stickerView;
                super.LJ();
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLLJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                if (getEnterMethod() != EnumC1558969x.Edit || (stickerView = getStickerView()) == null) {
                    return;
                }
                stickerView.post(new ARunnableS21S0200000_2(this, stickerView, 4));
            }

            @Override // X.C1559169z
            public final void LJFF() {
                InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                Activity LIZ = C105574Cj.LIZ(context);
                if (LIZ != null && inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(LIZ.getWindow().getDecorView().getWindowToken(), 0);
                }
            }

            @Override // X.C1559169z
            public final void LJII() {
                View stickerView = getStickerView();
                if (stickerView != null && (stickerView instanceof C64Q)) {
                    C64Q c64q = (C64Q) stickerView;
                    c64q.setVisibility(4);
                    UCH.LJLILLLLZI = this.LJLLILLLL;
                    c64q.getPollStickerTitleEditText$tools_sticker_common_release().setMaxLines(UCH.LJLILLLLZI);
                    c64q.setTouchEnable(false);
                    c64q.setEditEnable(true);
                    int i = C1558869w.LIZ[getEnterMethod().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        c64q.setEditTextFocusable(0);
                        return;
                    }
                    c64q.setEditTextFocusable(this.LJLLI.LJLJJLL);
                }
            }

            @Override // X.C1559169z
            public float getBottomTabHeight() {
                return super.getBottomTabHeight();
            }

            @Override // X.C1559169z
            public int getLayoutResId() {
                return super.getLayoutResId();
            }

            public final InterfaceC65784Pro<C76800UCe> getBusinessEnterEditCallBack() {
                return this.LJLLL;
            }

            public final InterfaceC65784Pro<C76800UCe> getBusinessExitEditCallBack() {
                return this.LJLLJ;
            }

            {
                new LinkedHashMap();
                this.LJLLI = new C6A2(0.0f, 0.0f, 0.0f, 0.0f, 63);
                this.LJLLILLLL = 3;
            }

            @Override // X.C1559169z
            public final void LIZ(View stickerView) {
                o.LJIIIZ(stickerView, "stickerView");
                super.LIZ(stickerView);
            }

            @Override // X.C1559169z
            public final void LIZJ(View stickerView) {
                o.LJIIIZ(stickerView, "stickerView");
                super.LIZJ(stickerView);
            }

            public final void setBusinessEnterEditCallBack(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
                this.LJLLL = interfaceC65784Pro;
            }

            public final void setBusinessExitEditCallBack(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
                this.LJLLJ = interfaceC65784Pro;
            }

            @Override // X.C1559169z
            public final void LIZLLL(C6A2 startAnimator, C6A2 endAnimator) {
                o.LJIIIZ(startAnimator, "startAnimator");
                o.LJIIIZ(endAnimator, "endAnimator");
                super.LIZLLL(startAnimator, endAnimator);
            }
        };
        r2.setBusinessExitEditCallBack(new AqS152S0100000_2(this, 498));
        r2.setBusinessEnterEditCallBack(new AqS152S0100000_2(this, 499));
        return r2;
    }

    public final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJJI.getValue();
    }

    public final InterfaceC1541563f LJJLIIIJJIZ() {
        return (InterfaceC1541563f) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.InterfaceC1541863i
    public void removeSticker() {
        LJJLIIIJJIZ().LIZIZ(this.LJLJL);
        this.LJLJL = null;
    }

    @Override // X.InterfaceC1541863i
    public void sg0() {
        LJJLIIIJILLIZJL().U2(false, false, false);
        LJJLIIIJJIZ().LIZIZ(this.LJLJL);
        C64W c64w = this.LJLJL;
        if (c64w != null) {
            LJJLIIIJJIZ().LIZLLL(c64w, LJJLIIIJJI());
        }
        InterfaceC1541563f LJJLIIIJJIZ = LJJLIIIJJIZ();
        o.LJII(LJJLIIIJJIZ, "null cannot be cast to non-null type com.ss.android.ugc.gamora.editor.sticker.MTStickerContainerServiceImpl");
        C63X c63x = C63X.POLL;
        int type = c63x.getType();
        C64I c64i = ((C64G) LJJLIIIJJIZ).LIZIZ;
        o.LJII(c64i, "null cannot be cast to non-null type com.tiktok.sticker.stickercontainer.MTStickerContainer");
        if (((C64F) c64i).LJLLL != null && type == c63x.getType()) {
            C1544564j.LIZ.storeBoolean("poll_sticker_explain_show", true);
        }
    }

    @Override // X.InterfaceC1541863i
    public C64W Pa() {
        return this.LJLJL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC1541863i getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C64L(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC1541563f.class, null);
        this.LJLJJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJL = "";
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 501));
    }

    @Override // X.InterfaceC1541863i
    public void F50(PollStickerModel pollStickerModel) {
        LJJLIIIJILLIZJL().U2(false, false, false);
        C64W NK = NK(pollStickerModel);
        this.LJLJL = NK;
        if (NK != null) {
            LJJLIIIJJIZ().LIZJ(NK, LJJLIIIJJI());
        }
    }

    @Override // X.InterfaceC1541863i
    public void LJIILLIIL(String id) {
        o.LJIIIZ(id, "id");
        this.LJLJJL = id;
    }

    public final void LJJLIIIJLLLLLLLZ(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJL = str;
    }

    public final void LJJLIIJ(C64N c64n) {
        c64n.LIZ().post(new ARunnableS38S0100000_2(c64n, 110));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1541863i
    public C64W NK(PollStickerModel pollStickerModel) {
        PollStickerModel pollStickerModel2 = pollStickerModel;
        if (pollStickerModel2 == null) {
            long j = 0;
            pollStickerModel2 = new PollStickerModel(null, j, j, 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }
        pollStickerModel2.setStickerContainerWidth(LJJLIIIJJIZ().Y0().getFirst().intValue());
        pollStickerModel2.setStickerContainerHeight(LJJLIIIJJIZ().Y0().getSecond().intValue());
        C64W c64w = new C64W(C78688UuS.LJJIII(this), pollStickerModel2);
        ((ArrayList) c64w.LIZ).clear();
        ((ArrayList) c64w.LIZ).add(LJJLI());
        LJJLIIJ(c64w);
        c64w.LIZIZ = new AqS152S0100000_2(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        return c64w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1541863i
    public void l50(PollStickerModel pollStickerModel) {
        boolean z;
        C64P c64p;
        PollStickerModel pollStickerModel2 = pollStickerModel;
        if (pollStickerModel2 == null) {
            long j = 0;
            pollStickerModel2 = new PollStickerModel(null, j, j, 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }
        if (pollStickerModel2.options.isEmpty()) {
            long j2 = 0;
            int i = 15;
            pollStickerModel2.options.add(new OptionsBean(null, j2, j2, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
            pollStickerModel2.options.add(new OptionsBean(0 == true ? 1 : 0, j2, j2, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
        }
        pollStickerModel2.setStickerContainerWidth(LJJLIIIJJIZ().Y0().getFirst().intValue());
        pollStickerModel2.setStickerContainerHeight(LJJLIIIJJIZ().Y0().getSecond().intValue());
        C64W NK = NK(pollStickerModel2);
        this.LJLJL = NK;
        if (NK != null && (c64p = NK.LJ) != null) {
            c64p.LIZ.setTouchEnable(true);
            c64p.LIZ.setEditEnable(false);
        }
        C64W c64w = this.LJLJL;
        if (c64w != null) {
            C64P c64p2 = c64w.LJ;
            PollStickerModel stickerModel = c64w.LJFF;
            c64p2.getClass();
            o.LJIIIZ(stickerModel, "stickerModel");
            C64Q c64q = c64p2.LIZ;
            c64q.setScaleX(stickerModel.getScale());
            c64q.setScaleY(stickerModel.getScale());
            c64q.setRotation(stickerModel.getRotation());
            c64p2.LIZ.setX(stickerModel.getCenterX());
            c64p2.LIZ.setY(stickerModel.getCenterY());
            C64Q c64q2 = c64p2.LIZ;
            c64q2.getClass();
            if (stickerModel.question.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c64q2.getPollStickerTitleEditText$tools_sticker_common_release().setVisibility(8);
                Space space = c64q2.LJLJJL;
                if (space != null) {
                    space.setVisibility(8);
                } else {
                    o.LJIJI("space");
                    throw null;
                }
            } else {
                c64q2.getPollStickerTitleEditText$tools_sticker_common_release().setText(stickerModel.question);
                c64q2.getPollStickerTitleEditText$tools_sticker_common_release().setVisibility(0);
                Space space2 = c64q2.LJLJJL;
                if (space2 != null) {
                    space2.setVisibility(0);
                } else {
                    o.LJIJI("space");
                    throw null;
                }
            }
            c64q2.getPollStickerOptionFirstEditText$tools_sticker_common_release().setText(((OptionsBean) ListProtector.get(stickerModel.options, 0)).postOption);
            c64q2.getPollStickerOptionSecondText$tools_sticker_common_release().setText(((OptionsBean) ListProtector.get(stickerModel.options, 1)).postOption);
            C64Q c64q3 = c64p2.LIZ;
            c64q3.getClass();
            c64q3.setScaleX(stickerModel.getScale());
            c64q3.setScaleY(stickerModel.getScale());
            float f = 2;
            c64q3.setX(stickerModel.getCenterX() - (stickerModel.getWidth() / f));
            c64q3.setY(stickerModel.getCenterY() - (stickerModel.getHeight() / f));
            c64q3.setRotation(stickerModel.getRotation());
            LJJLIIIJJIZ().LIZ(c64w);
        }
    }

    @Override // X.InterfaceC1541863i
    public boolean nN(RectF videoRectF) {
        PollStickerModel pollStickerModel;
        o.LJIIIZ(videoRectF, "videoRectF");
        C64W c64w = this.LJLJL;
        float f = 0.0f;
        PointF[] pointFArr = null;
        if (c64w != null && (pollStickerModel = c64w.LJFF) != null) {
            pointFArr = BaseStickerModel.getFourPointsWithRotationAndScale$default(pollStickerModel, 0.0f, 1, null);
        }
        if (pointFArr == null || pointFArr.length == 0) {
            return false;
        }
        float f2 = 2.1474836E9f;
        for (PointF pointF : pointFArr) {
            float f3 = pointF.y;
            if (f3 > f) {
                f = f3;
            }
            if (f3 < f2) {
                f2 = f3;
            }
        }
        if (f2 < videoRectF.top || f > videoRectF.bottom) {
            return true;
        }
        return false;
    }
}
