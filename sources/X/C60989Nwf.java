package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nwf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60989Nwf implements IHostStyleUIDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        o.LJIIIZ(actionSheetBuilder, "actionSheetBuilder");
        o.LJIIIZ(showActionSheetListener, "showActionSheetListener");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showDialog(DialogBuilder dialogBuilder) {
        o.LJIIIZ(dialogBuilder, "dialogBuilder");
        Activity LIZ = HT4.LIZ(dialogBuilder.getContext());
        if (LIZ == null) {
            return Boolean.FALSE;
        }
        boolean cancelOnTouchOutside = dialogBuilder.getCancelOnTouchOutside();
        String positiveBtnText = dialogBuilder.getPositiveBtnText();
        C26227ARb c26227ARb = new C26227ARb(LIZ);
        c26227ARb.LJFF(dialogBuilder.getTitle());
        c26227ARb.LIZIZ(dialogBuilder.getMessage());
        UC0.LIZJ(c26227ARb, new AqS63S1100000_10(positiveBtnText, dialogBuilder, 5));
        c26227ARb.LJII = cancelOnTouchOutside;
        c26227ARb.LIZJ(new AqS176S0100000_10(dialogBuilder, 156));
        c26227ARb.LJI().LIZLLL();
        return Boolean.TRUE;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean hideLoading(C60991Nwh params, C31926Cfy c31926Cfy) {
        Context context;
        String str;
        NJZ njz;
        o.LJIIIZ(params, "params");
        if (c31926Cfy == null || (context = (Context) c31926Cfy.LIZ(Context.class)) == null) {
            return Boolean.FALSE;
        }
        Activity LIZ = HT4.LIZ(context);
        InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) c31926Cfy.LIZ(InterfaceC37790EsM.class);
        if (interfaceC37790EsM == null || (str = interfaceC37790EsM.LIZ()) == null) {
            str = "";
        }
        Object obj = null;
        if (LIZ instanceof BulletContainerActivity) {
            AbstractActivityC60177NjZ abstractActivityC60177NjZ = (AbstractActivityC60177NjZ) LIZ;
            if (!abstractActivityC60177NjZ.isFinishing()) {
                View view = abstractActivityC60177NjZ.LLFII().LJLJJLL;
                if (view instanceof InterfaceC60207Nk3) {
                    obj = view;
                }
                InterfaceC60207Nk3 interfaceC60207Nk3 = (InterfaceC60207Nk3) obj;
                if (interfaceC60207Nk3 != null) {
                    interfaceC60207Nk3.hide();
                }
            }
            return Boolean.TRUE;
        }
        if (LIZ instanceof SparkActivity) {
            SparkActivity sparkActivity = (SparkActivity) LIZ;
            if (!sparkActivity.isFinishing()) {
                boolean z = params.LIZ;
                SparkFragment sparkFragment = sparkActivity.LJLLI;
                if (sparkFragment != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                        if (z) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLZ.removeAllViews();
                            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLZ.setVisibility(8);
                        } else {
                            InterfaceC60812Nto interfaceC60812Nto = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLL;
                            if (interfaceC60812Nto != null) {
                                interfaceC60812Nto.hide();
                            }
                        }
                    }
                } else {
                    o.LJIJI("sparkFragment");
                    throw null;
                }
            }
            return Boolean.TRUE;
        }
        SparkContext.Companion.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
        if (LIZIZ != null && (njz = (NJZ) LIZIZ.LIZIZ(NJZ.class)) != null) {
            njz.LIZ(params.LIZ);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showLoading(C61338O5m params, C31926Cfy c31926Cfy) {
        Context context;
        String str;
        NJZ njz;
        InterfaceC60812Nto interfaceC60812Nto;
        o.LJIIIZ(params, "params");
        if (c31926Cfy == null || (context = (Context) c31926Cfy.LIZ(Context.class)) == null) {
            return Boolean.FALSE;
        }
        Activity LIZ = HT4.LIZ(context);
        if (LIZ == null) {
            return Boolean.FALSE;
        }
        InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) c31926Cfy.LIZ(InterfaceC37790EsM.class);
        if (interfaceC37790EsM == null || (str = interfaceC37790EsM.LIZ()) == null) {
            str = "";
        }
        Object obj = null;
        if (LIZ instanceof BulletContainerActivity) {
            if (!LIZ.isFinishing()) {
                View view = ((AbstractActivityC60177NjZ) LIZ).LLFII().LJLJJLL;
                if (view instanceof InterfaceC60207Nk3) {
                    obj = view;
                }
                InterfaceC60207Nk3 interfaceC60207Nk3 = (InterfaceC60207Nk3) obj;
                if (interfaceC60207Nk3 != null) {
                    interfaceC60207Nk3.show();
                }
            }
            return Boolean.TRUE;
        }
        if (LIZ instanceof SparkActivity) {
            if (!LIZ.isFinishing()) {
                SparkFragment sparkFragment = ((SparkActivity) LIZ).LJLLI;
                if (sparkFragment != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (interfaceC60812Nto = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLL) != null) {
                        interfaceC60812Nto.show();
                    }
                } else {
                    o.LJIJI("sparkFragment");
                    throw null;
                }
            }
            return Boolean.TRUE;
        }
        SparkContext.Companion.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
        if (LIZIZ != null && (njz = (NJZ) LIZIZ.LIZIZ(NJZ.class)) != null) {
            njz.LIZIZ();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(ToastBuilder toastBuilder, C31926Cfy c31926Cfy) {
        String str;
        SparkContext LIZ;
        View view;
        Integer num;
        C26045AKb c26045AKb;
        long j;
        InterfaceC60761Nsz LJI;
        InterfaceC37790EsM interfaceC37790EsM;
        o.LJIIIZ(toastBuilder, "toastBuilder");
        Activity LIZ2 = HT4.LIZ(toastBuilder.getContext());
        String str2 = "";
        if (c31926Cfy == null || (interfaceC37790EsM = (InterfaceC37790EsM) c31926Cfy.LIZ(InterfaceC37790EsM.class)) == null || (str = interfaceC37790EsM.LIZ()) == null) {
            str = "";
        }
        SparkContext.Companion.getClass();
        InterfaceC40159FpT LIZ3 = C39359FcZ.LIZ(str);
        if (LIZ2 == null) {
            return Boolean.FALSE;
        }
        if (LIZ3 instanceof InterfaceC31125CJl) {
            LIZ = ((SparkPopup) LIZ3).LJLLI;
        } else {
            C109464Ri.LIZ.getClass();
            C117144ik c117144ik = C117144ik.LIZIZ;
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(LIZ2.getIntent(), "SparkContextContainerId");
            c117144ik.getClass();
            LIZ = C117144ik.LIZ(LLJJIJIIJIL);
        }
        Integer num2 = null;
        if (LIZ != null && (LJI = LIZ.LJI()) != null) {
            view = LJI.LIZJ();
        } else {
            view = null;
        }
        String type = toastBuilder.getType();
        String name = EnumC60990Nwg.ERROR.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (o.LJ(type, lowerCase)) {
            num2 = Integer.valueOf(R.attr.e7);
            num = Integer.valueOf(R.raw.icon_x_mark_small);
        } else {
            String lowerCase2 = EnumC60990Nwg.SUCCESS.name().toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (o.LJ(type, lowerCase2)) {
                num2 = Integer.valueOf(R.attr.e8);
                num = Integer.valueOf(R.raw.icon_tick_fill_small);
            } else {
                String lowerCase3 = EnumC60990Nwg.WARN.name().toLowerCase(locale);
                o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (o.LJ(type, lowerCase3)) {
                    num2 = Integer.valueOf(R.attr.e7);
                    num = Integer.valueOf(R.raw.icon_exclamation_mark_triangle_fill);
                } else {
                    num = null;
                }
            }
        }
        if (view != null) {
            c26045AKb = new C26045AKb(view);
        } else {
            c26045AKb = new C26045AKb(LIZ2);
        }
        String message = toastBuilder.getMessage();
        if (message != null) {
            str2 = message;
        }
        c26045AKb.LJIIIZ(str2);
        Integer duration = toastBuilder.getDuration();
        if (duration != null) {
            j = duration.intValue();
        } else {
            j = 3000;
        }
        c26045AKb.LIZLLL(j);
        c26045AKb.LIZ(true);
        if (num2 != null) {
            num2.intValue();
            c26045AKb.LJII(num2.intValue());
        }
        if (num != null) {
            num.intValue();
            c26045AKb.LJFF(num.intValue());
        }
        c26045AKb.LJIIJ();
        return Boolean.TRUE;
    }
}
