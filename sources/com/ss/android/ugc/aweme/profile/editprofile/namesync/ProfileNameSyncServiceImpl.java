package com.ss.android.ugc.aweme.profile.editprofile.namesync;

import X.AbstractC73638SvC;
import X.C221018lt;
import X.C221108m2;
import X.C237929Vk;
import X.C237949Vm;
import X.C238099Wb;
import X.C238129We;
import X.C238139Wf;
import X.C238149Wg;
import X.C238209Wm;
import X.C238219Wn;
import X.C238229Wo;
import X.C238249Wq;
import X.C26045AKb;
import X.C26227ARb;
import X.C34K;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C72972SkS;
import X.C73656SvU;
import X.C78685UuP;
import X.C9WC;
import X.HG3;
import X.InterfaceC238239Wp;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.RBX;
import X.UC0;
import X.X1D;
import Y.ACallableS5S1000000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileNameSyncServiceImpl implements ProfileNameSyncService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C238149Wg.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C238139Wf.LJLIL);

    public static ProfileNameSyncService LJI() {
        Object LIZ = C58096Mr6.LIZ(ProfileNameSyncService.class, false);
        if (LIZ != null) {
            return (ProfileNameSyncService) LIZ;
        }
        return new ProfileNameSyncServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final boolean LIZ() {
        if (!((Boolean) this.LIZ.getValue()).booleanValue()) {
            return false;
        }
        Keva LIZ = C238099Wb.LIZ();
        StringBuilder LJFF = C72972SkS.LJFF("username_to_nickname_pop_up_shown_count", '_');
        LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
        if (LIZ.getInt(X1D.LIZIZ(LJFF), 0) >= 3 || ((User) this.LIZIZ.getValue()).getNickNameModifyTs() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final boolean LIZIZ() {
        if (!((Boolean) this.LIZ.getValue()).booleanValue()) {
            return false;
        }
        Keva LIZ = C238099Wb.LIZ();
        StringBuilder LJFF = C72972SkS.LJFF("nickname_to_username_pop_up_shown_count", '_');
        LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
        if (LIZ.getInt(X1D.LIZIZ(LJFF), 0) >= 3 || ((User) this.LIZIZ.getValue()).getHandleModified() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final C73656SvU LIZJ(String str) {
        return AbstractC73638SvC.LJIILLIIL(new ACallableS5S1000000_6(str, this, 1));
    }

    public static OSZ LJII(C238129We c238129We, Context context) {
        String string;
        String string2;
        if (c238129We.LIZ) {
            if (c238129We.LIZIZ == C9WC.USERNAME) {
                string2 = context.getResources().getString(R.string.pcl);
            } else {
                string2 = context.getResources().getString(R.string.pcj);
            }
            return new OSZ(string2, Boolean.TRUE);
        }
        if (C78685UuP.LJJJZ(c238129We.LIZJ)) {
            return new OSZ(c238129We.LIZJ, Boolean.FALSE);
        }
        if (c238129We.LIZIZ == C9WC.USERNAME) {
            string = context.getResources().getString(R.string.pcp);
        } else {
            string = context.getResources().getString(R.string.pck);
        }
        return new OSZ(string, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final void LIZLLL(Fragment fragment, List syncResults, AqS154S0100000_4 aqS154S0100000_4) {
        String string;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(syncResults, "syncResults");
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) syncResults;
        if (arrayList.isEmpty() || arrayList.size() > 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid sync results: size: ");
            LIZ.append(arrayList.size());
            C221018lt.LIZIZ("ProfileNameSyncServiceImpl", X1D.LIZIZ(LIZ));
            return;
        }
        if (arrayList.size() == 1) {
            LJIIIIZZ(fragment, LJII((C238129We) ListProtector.get(syncResults, 0), context), 3000L, new AqS154S0100000_4(aqS154S0100000_4, 1076));
            return;
        }
        if (!((C238129We) ListProtector.get(syncResults, 0)).LIZ) {
            LJIIIIZZ(fragment, LJII((C238129We) ListProtector.get(syncResults, 0), context), 3000L, new AqS154S0100000_4(aqS154S0100000_4, 1077));
            return;
        }
        if (((C238129We) ListProtector.get(syncResults, 1)).LIZ) {
            if (((C238129We) ListProtector.get(syncResults, 0)).LIZIZ == C9WC.USERNAME) {
                string = context.getResources().getString(R.string.pcm);
            } else {
                string = context.getResources().getString(R.string.pch);
            }
            LJIIIIZZ(fragment, new OSZ(string, Boolean.TRUE), 3000L, new AqS154S0100000_4(aqS154S0100000_4, 1078));
            return;
        }
        LJIIIIZZ(fragment, LJII((C238129We) ListProtector.get(syncResults, 0), context), 1500L, new AqS64S0400000_4(this, fragment, LJII((C238129We) ListProtector.get(syncResults, 1), context), aqS154S0100000_4, 18));
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final void LJ(Context context, String str, C237949Vm c237949Vm) {
        String string = context.getResources().getString(R.string.pcv, str);
        o.LJIIIIZZ(string, "context.resources.getStr…iption2, updatedUsername)");
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 17);
        C238229Wo c238229Wo = new C238229Wo(context, new C238219Wn(R.string.pcz, R.string.pcx, spannableStringBuilder));
        final C34K c34k = new C34K();
        c34k.element = true;
        c238229Wo.setOnCheckedListener(new InterfaceC238239Wp() { // from class: X.9Wh
            @Override // X.InterfaceC238239Wp
            public final void LIZ(boolean z) {
                C34K.this.element = z;
            }
        });
        C26227ARb c26227ARb = new C26227ARb(context);
        UC0.LIZJ(c26227ARb, new AqS47S1200000_4(c237949Vm, str, c34k, 18));
        c26227ARb.LJIIJJI = new C238249Wq(c238229Wo);
        c26227ARb.LJI().LIZLLL();
        C238209Wm.LJ(c34k.element);
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService
    public final void LJFF(Context context, String str, C237929Vk c237929Vk) {
        String string = context.getResources().getString(R.string.pcu, str);
        o.LJIIIIZZ(string, "context.resources.getStr…ption, suggestedUsername)");
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 17);
        C238229Wo c238229Wo = new C238229Wo(context, new C238219Wn(R.string.pcy, R.string.pcw, spannableStringBuilder));
        final C34K c34k = new C34K();
        c34k.element = true;
        c238229Wo.setOnCheckedListener(new InterfaceC238239Wp() { // from class: X.9Wi
            @Override // X.InterfaceC238239Wp
            public final void LIZ(boolean z) {
                C34K.this.element = z;
            }
        });
        C26227ARb c26227ARb = new C26227ARb(context);
        UC0.LIZJ(c26227ARb, new AqS47S1200000_4(c237929Vk, str, c34k, 20));
        c26227ARb.LJIIJJI = new C238249Wq(c238229Wo);
        c26227ARb.LJI().LIZLLL();
        C238209Wm.LIZLLL(true);
    }

    public static void LJIIIIZZ(Fragment fragment, OSZ osz, long j, InterfaceC65784Pro interfaceC65784Pro) {
        C26045AKb c26045AKb = new C26045AKb(fragment);
        c26045AKb.LJIIIZ((CharSequence) osz.getFirst());
        c26045AKb.LIZJ(interfaceC65784Pro);
        c26045AKb.LIZLLL(j);
        if (((Boolean) osz.getSecond()).booleanValue()) {
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
        }
        c26045AKb.LJIIJ();
    }
}
