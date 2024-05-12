package X;

import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenHeightMaskAdaptivelySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJP extends AbstractC42811m9 {
    public final Context LJLJJL;
    public final DataChannel LJLJJLL;
    public final InterfaceC88474Ynu<Integer, Boolean, Boolean, Boolean, C76800UCe> LJLJL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJLJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJLLL;
    public final UJH LJLL;
    public final int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final C5H3 LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public int LLFF;
    public final int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public ConstraintProperty LLI;
    public boolean LLIFFJFJJ;
    public final UJS LLII;

    public final ValueAnimator LJ() {
        return (ValueAnimator) this.LJLLLLLL.getValue();
    }

    public final int LJFF() {
        if (this.LLFF != 0) {
            int LJIIIZ = KL2.LJIIIZ(this.LJLJJL) - this.LLFF;
            C1O4 c1o4 = this.LJLIL;
            return C78609UtB.LJJIIZ(((LJIIIZ - c1o4.LJIIIIZZ) - c1o4.LIZIZ) - c1o4.LIZLLL, this.LLFFF, this.LJLLI);
        }
        return this.LJLLI;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void dispose() {
        View view;
        super.dispose();
        ConstraintProperty constraintProperty = this.LLI;
        if (constraintProperty != null && (view = constraintProperty.getView()) != null) {
            view.removeOnLayoutChangeListener(this.LLII);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        this.LLFII = -1;
    }

    public static int LJI(int i) {
        return Math.max(100, (((int) C15380j0.LJIJ(i)) - ((int) C15380j0.LJIJ(C15380j0.LJFF(R.dimen.ahd)))) - 8);
    }

    public static boolean LJII(LayeredElementContext layeredElementContext) {
        if (C76128TuG.LIZIZ(layeredElementContext.getDataChannel(), false, 6) && ((IInteractService) CN1.LIZ(IInteractService.class)).yr() == 1) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC42811m9
    public final void LIZIZ(C006900z dialogStatus) {
        o.LJIIIZ(dialogStatus, "dialogStatus");
        ConstraintProperty constraintProperty = this.LLI;
        if (constraintProperty != null && this.LJLILLLLZI) {
            C29602Bja c29602Bja = dialogStatus.LIZ;
            if (c29602Bja.LIZ) {
                this.LJLJI = c29602Bja.LIZIZ;
            } else {
                this.LJLJI = 0;
                C29602Bja c29602Bja2 = dialogStatus.LIZIZ;
                if (c29602Bja2 != null && LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.giftTrayTranslateWithPublicScreen(c29602Bja2.LIZLLL)) {
                    this.LJLJI = c29602Bja2.LIZIZ;
                }
            }
            LJIIJ(constraintProperty, false);
        }
    }

    public final void LIZLLL(boolean z) {
        int i;
        if (z) {
            this.LJLJLJ.invoke(Boolean.TRUE);
            ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(R.id.k50);
            if (constraintPropertyById != null) {
                constraintPropertyById.removeConstraints(3);
                constraintPropertyById.removeConstraints(4);
                constraintPropertyById.connect(3, R.id.eqc, 3, 0);
                constraintPropertyById.apply();
            }
            View findViewById = this.LJLIL.getContainer().findViewById(R.id.k52);
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(0);
            return;
        }
        if (this.LJLZ > 0) {
            i = this.LJZ;
        } else {
            i = 0;
        }
        int dimensionPixelSize = this.LJLJJL.getResources().getDimensionPixelSize(R.dimen.ado) + i;
        this.LJLJLJ.invoke(Boolean.FALSE);
        ConstraintProperty constraintPropertyById2 = this.LJLIL.getConstraintPropertyById(R.id.k50);
        if (constraintPropertyById2 != null) {
            constraintPropertyById2.removeConstraints(3);
            constraintPropertyById2.removeConstraints(4);
            constraintPropertyById2.connect(4, R.id.bjy, 3, dimensionPixelSize);
            constraintPropertyById2.goneMargin(4, 0);
            constraintPropertyById2.apply();
        }
        View findViewById2 = this.LJLIL.getContainer().findViewById(R.id.k52);
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setVisibility(8);
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(R.id.bjy);
            if (constraintPropertyById != null) {
                constraintPropertyById.removeConstraints(3);
                constraintPropertyById.removeConstraints(4);
                constraintPropertyById.connect(3, R.id.dvk, 4, 0);
                constraintPropertyById.apply();
            }
        } else {
            ConstraintProperty constraintPropertyById2 = this.LJLIL.getConstraintPropertyById(R.id.bjy);
            if (constraintPropertyById2 != null) {
                constraintPropertyById2.removeConstraints(3);
                constraintPropertyById2.removeConstraints(4);
                constraintPropertyById2.connect(4, R.id.eqk, 3, 0);
                constraintPropertyById2.apply();
            }
        }
        this.LJLJLLL.invoke(Boolean.valueOf(z));
    }

    public final void LIZJ(int i, boolean z) {
        int i2;
        int i3;
        View view;
        int i4;
        int i5;
        View view2;
        if (LivePublicScreenHeightMaskAdaptivelySetting.heightenWhenScroll(this.LJLJJLL)) {
            View findViewById = this.LJLIL.getContainer().findViewById(R.id.eqe);
            if (findViewById != null) {
                i4 = findViewById.getTop();
            } else {
                i4 = 0;
            }
            ConstraintProperty constraintProperty = this.LLI;
            if (constraintProperty != null && (view2 = constraintProperty.getView()) != null) {
                i5 = view2.getBottom();
            } else {
                i5 = 0;
            }
            int i6 = i4 - i5;
            ConstraintProperty constraintProperty2 = this.LLI;
            if (constraintProperty2 != null) {
                constraintProperty2.connect(3, R.id.eqa, 4, 0);
            }
            ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(R.id.eqb);
            if (z) {
                if (i6 != i) {
                    if (constraintPropertyById != null) {
                        constraintPropertyById.connect(4, R.id.eqe, 3, i6);
                    }
                    LJ().removeAllUpdateListeners();
                    LJ().addUpdateListener(new AUListenerS100S0100000_13(constraintPropertyById, 92));
                    LJ().setIntValues(i6, i);
                    LJ().start();
                    return;
                }
                return;
            }
            if (constraintPropertyById == null) {
                return;
            }
            constraintPropertyById.connect(4, R.id.eqe, 3, i);
            return;
        }
        if (z) {
            View findViewById2 = this.LJLIL.getContainer().findViewById(R.id.eqe);
            if (findViewById2 != null) {
                i2 = findViewById2.getTop();
            } else {
                i2 = 0;
            }
            ConstraintProperty constraintProperty3 = this.LLI;
            if (constraintProperty3 != null && (view = constraintProperty3.getView()) != null) {
                i3 = view.getBottom();
            } else {
                i3 = 0;
            }
            int i7 = i2 - i3;
            ConstraintProperty constraintProperty4 = this.LLI;
            if (constraintProperty4 != null) {
                constraintProperty4.connect(4, R.id.eqe, 3, i7);
            }
            if (i7 == i) {
                return;
            }
            LJ().removeAllUpdateListeners();
            LJ().addUpdateListener(new AUListenerS100S0100000_13(this, 91));
            LJ().setIntValues(i7, i);
            LJ().start();
            return;
        }
        ConstraintProperty constraintProperty5 = this.LLI;
        if (constraintProperty5 == null) {
            return;
        }
        constraintProperty5.connect(4, R.id.eqe, 3, i);
    }

    public final void LJIIIIZZ(int i, boolean z) {
        if ((this.LLFII != i && i > 0) || this.LLFZ != z) {
            this.LLFZ = z;
            this.LLFII = i;
            this.LJLJL.invoke(Integer.valueOf(this.LJLIL.LJIIJJI + i), Boolean.valueOf(z), Boolean.valueOf(this.LJZL), Boolean.valueOf(LJ().isRunning()));
            this.LJLJJLL.qv0(UpdateStickerPositionEvent.class, new C29652BkO(i + this.LJLIL.LJIIJJI));
        }
    }

    public final void LJIIJ(ConstraintProperty constraintProperty, boolean z) {
        if (this.LJZL && this.LLIFFJFJJ) {
            return;
        }
        LJ().cancel();
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        if (this.LJLJI > 0) {
            LIZJ(LIZ(), false);
        } else {
            boolean z2 = this.LJZL;
            if (z2 && this.LJLL.LIZLLL) {
                LIZJ(this.LL, false);
            } else if (this.LJLLILLLL) {
                constraintProperty.connect(4, 0, 4, this.LJZI + this.LJLIL.LJIIJJI);
                LIZLLL(true);
                LJIIIZ(true);
            } else {
                UJH ujh = this.LJLL;
                if (ujh.LIZLLL) {
                    constraintProperty.connect(3, 0, 3, ujh.LJI + this.LJLIL.LIZLLL);
                    LIZLLL(true);
                    LJIIIZ(true);
                } else if (this.LJLLJ || z2) {
                    LIZJ(LJFF(), false);
                } else if (this.LJLLL || this.LJLLLL) {
                    if (this.LJLLLL) {
                        LIZJ(this.LLF, true);
                    } else {
                        LIZJ(this.LLD, true);
                    }
                } else {
                    LIZJ(LJFF(), z);
                    LIZLLL(false);
                    LJIIIZ(false);
                }
            }
        }
        constraintProperty.apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJP(C1O4 layeredElementContext, Context context, DataChannel dataChannel, UJY ujy, C76984UJg c76984UJg, C76985UJh c76985UJh) {
        super(R.id.eqc, layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJJL = context;
        this.LJLJJLL = dataChannel;
        this.LJLJL = ujy;
        this.LJLJLJ = c76984UJg;
        this.LJLJLLL = c76985UJh;
        this.LJLL = new UJH(layeredElementContext);
        this.LJLLI = context.getResources().getDimensionPixelSize(R.dimen.aek);
        this.LJLLLLLL = C78996UzQ.LJJIJIIJI(LDI.LJLIL);
        this.LJZI = C15380j0.LIZ(100.0f);
        this.LL = C15380j0.LIZ(200.0f);
        this.LLD = C87277YNd.LJIIJJI(138);
        this.LLF = C87277YNd.LJIIJJI(260);
        this.LLFFF = context.getResources().getDimensionPixelSize(R.dimen.aej);
        this.LLFII = -1;
        this.LLII = new UJS(this, layeredElementContext);
        addSceneObserver(new UJE(this));
        addSceneObserver(new UJR(this));
        addSceneObserver(new UJQ(this));
        addSceneObserver(new C77000UJw(this));
        addSceneObserver(new UJO(this));
        addSceneObserver(new UJJ(this));
        addSceneObserver(new UJ2(this));
        addSceneObserver(new C76966UIo(this));
        addSceneObserver(new UJD(this));
        addSceneObserver(new UJC(this));
        addSceneObserver(new C76967UIp(this));
        addSceneObserver(new UJI(this));
        addSceneObserver(new UJF(this));
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(this, 583));
    }
}
