package Y;

import X.AEY;
import X.AI8;
import X.AI9;
import X.C141335gf;
import X.C16880lQ;
import X.C25944AGe;
import X.C26045AKb;
import X.C3C4;
import X.C3C5;
import X.C64797Pbt;
import X.InterfaceC247699np;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;
import X.XJL;
import android.app.Dialog;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateResponse;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsData;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class IDdS377S0100000_4 implements InterfaceC36621EYv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<Object> interfaceC37276Ek4, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, interfaceC37276Ek4, th);
                return;
            case 1:
                LIZJ$1(this, interfaceC37276Ek4, th);
                return;
            case 2:
                LIZJ$2(this, interfaceC37276Ek4, th);
                return;
            case 3:
                LIZJ$3(this, interfaceC37276Ek4, th);
                return;
            case 4:
                LIZJ$4(this, interfaceC37276Ek4, th);
                return;
            case 5:
                LIZJ$5(this, interfaceC37276Ek4, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<Object> interfaceC37276Ek4, C64797Pbt<Object> c64797Pbt) {
        switch (this.$t) {
            case 0:
                LJII$0(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 1:
                LJII$1(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 2:
                LJII$2(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 3:
                LJII$3(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 4:
                LJII$4(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 5:
                LJII$5(this, interfaceC37276Ek4, c64797Pbt);
                return;
            default:
                return;
        }
    }

    public IDdS377S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        XJL xjl = (XJL) iDdS377S0100000_4.l0;
        C3C4 LIZ = C141335gf.LIZ(t);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    public static final void LIZJ$1(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((Dialog) ((AdSettingsActivity) iDdS377S0100000_4.l0).LJLJL.getValue()).dismiss();
        ((AdSettingsActivity) iDdS377S0100000_4.l0).finish();
    }

    public static final void LIZJ$2(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    public static final void LIZJ$3(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    public static final void LIZJ$4(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    public static final void LIZJ$5(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        ((InterfaceC247699np) iDdS377S0100000_4.l0).onFail();
    }

    public static final void LJII$0(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        XJL xjl = (XJL) iDdS377S0100000_4.l0;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$1(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, C64797Pbt c64797Pbt) {
        AdSettingsData adSettingsData;
        Integer num;
        boolean z;
        int i;
        long j;
        long j2;
        o.LJIIIZ(call, "call");
        ((Dialog) ((AdSettingsActivity) iDdS377S0100000_4.l0).LJLJL.getValue()).dismiss();
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && c64797Pbt.LIZIZ != 0) {
            String str = null;
            try {
                adSettingsData = (AdSettingsData) GsonHolder.LIZLLL().LIZ().LJI((String) c64797Pbt.LIZIZ, AdSettingsData.class);
                boolean z2 = true;
                int i2 = 0;
                if (adSettingsData != null && (num = adSettingsData.statusCode) != null && num.intValue() == 0) {
                    AdSettingsActivity adSettingsActivity = (AdSettingsActivity) iDdS377S0100000_4.l0;
                    adSettingsActivity.getClass();
                    if (adSettingsData == null) {
                        return;
                    }
                    Boolean bool = adSettingsData.promotable;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    AI9 accessory = ((AI8) adSettingsActivity._$_findCachedViewById(R.id.qp)).getAccessory();
                    o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
                    AEY aey = (AEY) accessory;
                    Integer num2 = adSettingsData.darkPostSource;
                    if (num2 == null || num2.intValue() != 1) {
                        Integer num3 = adSettingsData.darkPostStatus;
                        if (num3 == null || num3.intValue() != 1) {
                            z2 = false;
                        }
                        aey.LJIILIIL(z2);
                    } else {
                        aey.LJIILIIL(true);
                        String string = adSettingsActivity.getString(R.string.skf);
                        o.LJIIIIZZ(string, "this.getString(R.string.tt_adsetting_adonly_bc)");
                        String string2 = adSettingsActivity.getString(R.string.skg);
                        o.LJIIIIZZ(string2, "this.getString(R.string.…etting_adonly_bc_details)");
                        SpannableStringBuilder style = new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) string2);
                        o.LJIIIIZZ(style, "style");
                        int LJJLIIIJL = s.LJJLIIIJL(style, string2, 0, false, 6);
                        style.setSpan(new IDCSpanS28S0100000_1(adSettingsActivity, 1), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
                        ((AI8) adSettingsActivity._$_findCachedViewById(R.id.qp)).setSubtitle(new SpannableStringBuilder(((AI8) adSettingsActivity._$_findCachedViewById(R.id.qp)).getSubtitle()).append((CharSequence) "\n").append((CharSequence) style));
                        ((AI8) adSettingsActivity._$_findCachedViewById(R.id.qp)).setOnClickListener(new AqS167S0100000_1(adSettingsActivity, 192));
                    }
                    AI9 accessory2 = ((AI8) adSettingsActivity._$_findCachedViewById(R.id.ts)).getAccessory();
                    o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
                    ((AEY) accessory2).LJIILIIL(z);
                    ((CompoundButton) adSettingsActivity._$_findCachedViewById(R.id.b7k)).setChecked(z);
                    View _$_findCachedViewById = adSettingsActivity._$_findCachedViewById(R.id.fhc);
                    if (!z) {
                        i2 = 8;
                    }
                    _$_findCachedViewById.setVisibility(i2);
                    String str2 = adSettingsData.videoCode;
                    Integer num4 = adSettingsData.codeStatus;
                    if (num4 != null) {
                        i = num4.intValue();
                    } else {
                        i = -1;
                    }
                    Long l = adSettingsData.startTime;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    Long l2 = adSettingsData.endTime;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    adSettingsActivity.LLIIIJ(i, j, j2, str2);
                    return;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                adSettingsData = null;
            }
            ((Dialog) ((AdSettingsActivity) iDdS377S0100000_4.l0).LJLJL.getValue()).dismiss();
            ((AdSettingsActivity) iDdS377S0100000_4.l0).finish();
            if (adSettingsData != null) {
                str = adSettingsData.statusMsg;
            }
            if (TextUtils.isEmpty(str)) {
                str = "Request Failed";
            }
            C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$2(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        T t;
        m LLFZ;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (t = c64797Pbt.LIZIZ) != 0 && (LLFZ = ((AdSettingsActivity) iDdS377S0100000_4.l0).LLFZ((String) t)) != null) {
            j LJJIJ = LLFZ.LJJIJ("status_msg");
            if (LJJIJ != null) {
                LJJIJ.LJJIFFI();
            }
            j LJJIJ2 = LLFZ.LJJIJ("status_code");
            if (LJJIJ2 != null && LJJIJ2.LJIILJJIL() == 0) {
                C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
                c26045AKb.LJIIIZ(((AdSettingsActivity) iDdS377S0100000_4.l0).getResources().getString(R.string.ege));
                c26045AKb.LJIIJ();
                ((AdSettingsActivity) iDdS377S0100000_4.l0).LLIIIJ(-1, 0L, 0L, "");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$3(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        T t;
        m LLFZ;
        j LJJIJ;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (t = c64797Pbt.LIZIZ) != 0 && (LLFZ = ((AdSettingsActivity) iDdS377S0100000_4.l0).LLFZ((String) t)) != null && (LJJIJ = LLFZ.LJJIJ("status_code")) != null && LJJIJ.LJIILJJIL() == 0) {
            C26045AKb c26045AKb = new C26045AKb((AdSettingsActivity) iDdS377S0100000_4.l0);
            c26045AKb.LJIIIZ(((AdSettingsActivity) iDdS377S0100000_4.l0).getResources().getString(R.string.pji));
            c26045AKb.LJIIJ();
            AdSettingsActivity adSettingsActivity = (AdSettingsActivity) iDdS377S0100000_4.l0;
            String str = adSettingsActivity.LJLIL;
            if (str == null) {
                return;
            }
            adSettingsActivity.LJLJJLL.requestAdSettings(str).enqueue(new IDdS377S0100000_4(adSettingsActivity, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$4(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        T t;
        m LLFZ;
        j LJJIJ;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (t = c64797Pbt.LIZIZ) != 0 && (LLFZ = ((AdSettingsActivity) iDdS377S0100000_4.l0).LLFZ((String) t)) != null && (LJJIJ = LLFZ.LJJIJ("status_code")) != null) {
            int LJIILJJIL = LJJIJ.LJIILJJIL();
            if (LJIILJJIL != 4016) {
                if (LJIILJJIL != 4017) {
                    return;
                }
                AdSettingsActivity adSettingsActivity = (AdSettingsActivity) iDdS377S0100000_4.l0;
                String string = adSettingsActivity.getResources().getString(R.string.pjd);
                o.LJIIIIZZ(string, "resources.getString(R.st…elete_code_popup_subtext)");
                String string2 = ((AdSettingsActivity) iDdS377S0100000_4.l0).getResources().getString(R.string.efd);
                o.LJIIIIZZ(string2, "resources.getString(R.string.delete)");
                AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((AdSettingsActivity) iDdS377S0100000_4.l0, 823);
                String string3 = ((AdSettingsActivity) iDdS377S0100000_4.l0).getResources().getString(R.string.pje);
                o.LJIIIIZZ(string3, "resources.getString(R.st…_delete_code_popup_title)");
                adSettingsActivity.LLII(string, string2, aqS154S0100000_4, true, string3);
                return;
            }
            AdSettingsActivity adSettingsActivity2 = (AdSettingsActivity) iDdS377S0100000_4.l0;
            String string4 = adSettingsActivity2.getResources().getString(R.string.pjc);
            o.LJIIIIZZ(string4, "resources.getString(R.st…_delete_code_error_popup)");
            String string5 = ((AdSettingsActivity) iDdS377S0100000_4.l0).getResources().getString(R.string.ehr);
            o.LJIIIIZZ(string5, "resources.getString(R.string.dialog_ok)");
            adSettingsActivity2.LLII(string4, string5, C25944AGe.LJLIL, false, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII$5(IDdS377S0100000_4 iDdS377S0100000_4, InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ() && o.LJ(((AgeGateResponse) response.LIZIZ).isAdult(), Boolean.TRUE)) {
            ((InterfaceC247699np) iDdS377S0100000_4.l0).onSuccess();
        } else {
            ((InterfaceC247699np) iDdS377S0100000_4.l0).onFail();
        }
    }
}
