package Y;

import X.C252949wI;
import X.C71786SFi;
import X.C74088T5w;
import X.EnumC71789SFl;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.OSZ;
import X.RB8;
import X.RBA;
import X.SAU;
import X.SAX;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDxS310S0100000_11 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS310S0100000_11 iDxS310S0100000_11) {
    }

    public static final void onComplete$1(IDxS310S0100000_11 iDxS310S0100000_11) {
    }

    public static final void onComplete$2(IDxS310S0100000_11 iDxS310S0100000_11) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            case 2:
                o.LJIIIZ(th, "e");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            case 2:
                onSubscribe$2(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public IDxS310S0100000_11(BaseUpdatePasswordFragment baseUpdatePasswordFragment, int i) {
        this.$t = i;
        this.l0 = baseUpdatePasswordFragment;
    }

    public static final void onNext$0(IDxS310S0100000_11 iDxS310S0100000_11, Object obj) {
        SAX sax;
        SAX sax2;
        SAX sax3;
        RB8 validationResult = (RB8) obj;
        o.LJIIIZ(validationResult, "validationResult");
        int i = RBA.LIZ[validationResult.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    if (validationResult.LIZIZ) {
                        ((C252949wI) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.byj)).LIZ();
                        return;
                    }
                    BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) iDxS310S0100000_11.l0;
                    String invalidCharDefaultErrorMsg = validationResult.LIZJ;
                    if (invalidCharDefaultErrorMsg == null) {
                        invalidCharDefaultErrorMsg = (String) baseUpdatePasswordFragment.LLIIIILZ.getValue();
                        o.LJIIIIZZ(invalidCharDefaultErrorMsg, "invalidCharDefaultErrorMsg");
                    }
                    baseUpdatePasswordFragment.Sg(0, invalidCharDefaultErrorMsg);
                    return;
                }
                SAU checklist_item_char_length = (SAU) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.b_y);
                o.LJIIIIZZ(checklist_item_char_length, "checklist_item_char_length");
                if (validationResult.LIZIZ) {
                    sax3 = SAX.Success;
                } else {
                    sax3 = SAX.None;
                }
                checklist_item_char_length.setVariant(sax3);
                return;
            }
            SAU checklist_item_special_char = (SAU) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.ba3);
            o.LJIIIIZZ(checklist_item_special_char, "checklist_item_special_char");
            if (validationResult.LIZIZ) {
                sax2 = SAX.Success;
            } else {
                sax2 = SAX.None;
            }
            checklist_item_special_char.setVariant(sax2);
            return;
        }
        SAU checklist_item_letter_number = (SAU) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.ba2);
        o.LJIIIIZZ(checklist_item_letter_number, "checklist_item_letter_number");
        if (validationResult.LIZIZ) {
            sax = SAX.Success;
        } else {
            sax = SAX.None;
        }
        checklist_item_letter_number.setVariant(sax);
    }

    public static final void onNext$1(IDxS310S0100000_11 iDxS310S0100000_11, Object obj) {
        EnumC71789SFl complexity = (EnumC71789SFl) obj;
        o.LJIIIZ(complexity, "complexity");
        ((C71786SFi) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.hio)).LIZ(complexity);
    }

    public static final void onNext$2(IDxS310S0100000_11 iDxS310S0100000_11, Object obj) {
        boolean z;
        OSZ result = (OSZ) obj;
        o.LJIIIZ(result, "result");
        BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) iDxS310S0100000_11.l0;
        result.getSecond();
        baseUpdatePasswordFragment.getClass();
        C74088T5w c74088T5w = (C74088T5w) ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0)._$_findCachedViewById(R.id.byh);
        if (((Boolean) result.getFirst()).booleanValue() && ((EnumC71789SFl) result.getSecond()).isSetPasswordAllowed()) {
            z = true;
        } else {
            z = false;
        }
        c74088T5w.setEnabled(z);
    }

    public static final void onSubscribe$0(IDxS310S0100000_11 iDxS310S0100000_11, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0).LLII.LIZ(d);
    }

    public static final void onSubscribe$1(IDxS310S0100000_11 iDxS310S0100000_11, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0).LLII.LIZ(d);
    }

    public static final void onSubscribe$2(IDxS310S0100000_11 iDxS310S0100000_11, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((BaseUpdatePasswordFragment) iDxS310S0100000_11.l0).LLII.LIZ(d);
    }
}
