package X;

import Y.IDCListenerS259S0100000_13;
import android.view.View;
import com.bytedance.android.live.gift.NormalGiftLayoutBottomMarginUpdateEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJX extends AbstractC42811m9 {
    public int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public ConstraintProperty LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public boolean LLFF;
    public int LLFFF;
    public final IDCListenerS259S0100000_13 LLFII;
    public final IDCListenerS259S0100000_13 LLFZ;
    public final IDCListenerS259S0100000_13 LLI;
    public ViewOnLayoutChangeListenerC76983UJf LLIFFJFJJ;
    public ViewOnLayoutChangeListenerC76988UJk LLII;

    public final int LIZJ() {
        LiveMultiHostGiftTrayOptSetting liveMultiHostGiftTrayOptSetting = LiveMultiHostGiftTrayOptSetting.INSTANCE;
        if (liveMultiHostGiftTrayOptSetting.isMediumGiftTray()) {
            return this.LJLJLJ;
        }
        if (liveMultiHostGiftTrayOptSetting.isTinyGiftTray()) {
            return this.LJLJLLL;
        }
        return this.LJLIL.LJIIIIZZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void dispose() {
        View findViewById;
        View view;
        View findViewById2;
        View view2;
        super.dispose();
        ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(R.id.k50);
        if (constraintPropertyById != null && (view2 = constraintPropertyById.getView()) != null) {
            view2.removeOnLayoutChangeListener(this.LLFZ);
        }
        ViewOnLayoutChangeListenerC76983UJf viewOnLayoutChangeListenerC76983UJf = this.LLIFFJFJJ;
        if (viewOnLayoutChangeListenerC76983UJf != null && (findViewById2 = this.LJLIL.getContainer().findViewById(R.id.k52)) != null) {
            findViewById2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC76983UJf);
        }
        ConstraintProperty constraintPropertyById2 = this.LJLIL.getConstraintPropertyById(R.id.k50);
        if (constraintPropertyById2 != null && (view = constraintPropertyById2.getView()) != null) {
            view.removeOnLayoutChangeListener(this.LLFII);
        }
        ViewOnLayoutChangeListenerC76988UJk viewOnLayoutChangeListenerC76988UJk = this.LLII;
        if (viewOnLayoutChangeListenerC76988UJk != null && (findViewById = this.LJLIL.getContainer().findViewById(R.id.hwh)) != null) {
            findViewById.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC76988UJk);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJX(C1O4 layeredElementContext) {
        super(R.id.eqk, layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLJJL = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.agk);
        this.LJLJJLL = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.aak);
        this.LJLJL = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.ac9);
        this.LJLJLJ = (C15380j0.LIZ(32.0f) * 2) + layeredElementContext.LJFF;
        this.LJLJLLL = (C15380j0.LIZ(24.0f) * 2) + layeredElementContext.LJFF;
        this.LJLLLL = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.acr);
        this.LJLZ = -1;
        addSceneObserver(new C76979UJb(this));
        addSceneObserver(new UJU(this));
        addSceneObserver(new UJW(this));
        addSceneObserver(new C76980UJc(this));
        addSceneObserver(new C76981UJd(this));
        if (layeredElementContext.LIZ()) {
            addSceneObserver(new C76982UJe(this));
        }
        addSceneObserver(new C76978UJa(this));
        addSceneObserver(new UJV(this));
        ElementSpecImplKt.onAttach(this, new AqS144S0200000_13(layeredElementContext, this, 96));
        this.LLFII = new IDCListenerS259S0100000_13(this, 6);
        this.LLFZ = new IDCListenerS259S0100000_13(this, 7);
        this.LLI = new IDCListenerS259S0100000_13(this, 8);
    }

    @Override // X.AbstractC42811m9
    public final void LIZIZ(C006900z dialogStatus) {
        o.LJIIIZ(dialogStatus, "dialogStatus");
        C29602Bja c29602Bja = dialogStatus.LIZ;
        boolean z = c29602Bja.LIZ;
        if (this.LJLJJI && this.LJZI != null) {
            if (z) {
                this.LJLJI = c29602Bja.LIZIZ;
            } else {
                this.LJLJI = 0;
                C29602Bja c29602Bja2 = dialogStatus.LIZIZ;
                if (c29602Bja2 != null) {
                    LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
                    if (liveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen(c29602Bja2.LIZLLL) || liveGiftTrayPublicScreenTranslateSetting.canGiftTrayTranslationXfer(c29602Bja2.LIZLLL)) {
                        this.LJLJI = c29602Bja2.LIZIZ;
                    }
                }
            }
            ConstraintProperty constraintProperty = this.LJZI;
            if (constraintProperty != null) {
                LJ(constraintProperty);
            }
            LIZLLL(this, true, false, 2);
        }
    }

    public final void LJ(ConstraintProperty constraintProperty) {
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        int i = this.LJLZ;
        if (i == -1) {
            if (this.LJZL) {
                constraintProperty.connect(4, R.id.n4l, 3, this.LJLIL.LIZLLL);
            } else {
                constraintProperty.connect(4, R.id.eqc, 3, this.LJLIL.LIZLLL);
            }
        } else {
            constraintProperty.connect(4, 0, 4, i + this.LJLIL.LIZLLL);
        }
        constraintProperty.apply();
    }

    public static void LIZLLL(UJX ujx, boolean z, boolean z2, int i) {
        int i2;
        int i3;
        int i4;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        int i5 = ujx.LJLLLLLL;
        int i6 = ujx.LJLJI;
        if (i6 > 0) {
            if (!z) {
                return;
            }
            if (ujx.LJLILLLLZI) {
                i5 = ujx.LIZ() + i6 + ujx.LJLIL.LIZLLL;
            } else if (ujx.LJLJJI) {
                i5 = i6;
            }
            i4 = i5 + ujx.LJLJL;
            if (i4 != ujx.LJZ) {
                ujx.LJZ = i4;
                ujx.LJLIL.getDataChannel().qv0(NormalGiftLayoutBottomMarginUpdateEvent.class, new C32007ChH(i4, true));
            }
        } else {
            int i7 = ujx.LJLZ;
            if (i7 != -1) {
                if (i5 <= i7) {
                    i5 = i7;
                }
                if (ujx.LJLL && !ujx.LJLLI) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLJJL;
                }
                if (ujx.LJLLILLLL && !ujx.LJLLJ) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLJJLL;
                }
                if (ujx.LJLLL) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLLLL;
                }
                i2 = i5 + ujx.LLD + ujx.LLF;
                i3 = ujx.LL;
            } else if (ujx.LLFF) {
                if (ujx.LLFFF == 0) {
                    ujx.LLFFF = i5 - ujx.LIZJ();
                }
                i4 = ujx.LLFFF;
            } else {
                if (ujx.LJLL && !ujx.LJLLI) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLJJL;
                }
                if (ujx.LJLLILLLL && !ujx.LJLLJ) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLJJLL;
                }
                if (ujx.LJLLL) {
                    i5 += ujx.LJLIL.LIZLLL + ujx.LJLLLL;
                }
                i2 = i5 + ujx.LLF;
                i3 = ujx.LL;
            }
            i4 = i2 + i3;
        }
        int i8 = i4 + ujx.LJLJL;
        if (i8 == ujx.LJZ) {
            return;
        }
        ujx.LJZ = i8;
        ujx.LJLIL.getDataChannel().qv0(NormalGiftLayoutBottomMarginUpdateEvent.class, new C32007ChH(i8, z2));
    }
}
