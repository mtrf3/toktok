package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C50865Jxl;
import X.C51396KFc;
import X.C51415KFv;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.KAK;
import X.KE3;
import X.KFR;
import X.KFY;
import X.KGI;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OrderVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC55102Lju {
    public C50865Jxl LJLIL;
    public final Gson LJLILLLLZI;
    public final C214298b3 LJLJI;
    public KFR LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.jif);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jif)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1245798836) {
            return null;
        }
        return this;
    }

    public OrderVerticalAssem() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLILLLLZI = LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(OrderVerticalVM.class);
        this.LJLJI = new C214298b3(new AqS158S0100000_8((InterfaceC65350Pko) LIZ2, 64), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C51415KFv.INSTANCE, LIZ2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        this.LJLJJI = new KFR(KAK.ECOM_LIVE);
        ((OrderVerticalVM) this.LJLJI.getValue()).LJLJI = this.LJLJJI;
        ((OrderVerticalVM) this.LJLJI.getValue()).LJLJJI = C55096Ljo.LJIIZILJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C50865Jxl c50865Jxl = this.LJLIL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c50865Jxl != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onPause();
        C50865Jxl c50865Jxl = this.LJLIL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 16));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onResume();
        C50865Jxl c50865Jxl = this.LJLIL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b3 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: Exception -> 0x0202, LOOP:0: B:68:0x014f->B:70:0x0155, LOOP_END, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a9 A[Catch: Exception -> 0x0202, TryCatch #2 {Exception -> 0x0202, blocks: (B:123:0x0066, B:22:0x006b, B:24:0x007d, B:28:0x00ae, B:30:0x00b4, B:32:0x00b9, B:33:0x00c2, B:35:0x00c8, B:37:0x00ce, B:38:0x00d3, B:40:0x00e9, B:42:0x00ed, B:43:0x00f2, B:46:0x0104, B:48:0x010d, B:50:0x0111, B:51:0x0116, B:53:0x011a, B:54:0x011f, B:56:0x0123, B:57:0x0128, B:59:0x012c, B:60:0x0131, B:62:0x0137, B:63:0x013d, B:65:0x0143, B:67:0x0147, B:68:0x014f, B:70:0x0155, B:72:0x0169, B:74:0x0176, B:75:0x017e, B:77:0x0184, B:79:0x0198, B:81:0x019e, B:82:0x01a3, B:84:0x01a9, B:86:0x01b9, B:88:0x01bd, B:92:0x01c8, B:94:0x01ce, B:96:0x01d3, B:98:0x01d7, B:99:0x01de, B:101:0x01af, B:103:0x01b3, B:109:0x00a7), top: B:122:0x0066 }] */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshData() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.OrderVerticalAssem.refreshData():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C50865Jxl c50865Jxl;
        o.LJIIIZ(view, "view");
        Context context = getContext();
        if (context != null) {
            c50865Jxl = new C50865Jxl(context, C212428Vi.LIZLLL(this));
        } else {
            c50865Jxl = null;
        }
        this.LJLIL = c50865Jxl;
        if (c50865Jxl != null) {
            ViewGroup search_vertical_page = (ViewGroup) _$_findCachedViewById(R.id.jif);
            o.LJIIIIZZ(search_vertical_page, "search_vertical_page");
            c50865Jxl.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), search_vertical_page);
        }
        _$_findCachedViewById(R.id.jif).setVisibility(0);
        if (!KGI.LIZ()) {
            C50865Jxl c50865Jxl2 = this.LJLIL;
            if (c50865Jxl2 == null) {
                return;
            } else {
                v3(c50865Jxl2);
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.KFl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35652Dyy) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 6), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.KFm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35652Dyy) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0100000_8(this, 29), null, new AqS174S0100000_8(this, 30), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void tt(boolean z) {
        int i;
        KE3 H2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("active", i);
            if (z) {
                String str = null;
                ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
                if (iSearchVerticalContext != null && (H2 = iSearchVerticalContext.H2()) != null) {
                    str = H2.LIZ;
                }
                jSONObject.put("from_search_subtab", str);
            }
            C50865Jxl c50865Jxl = this.LJLIL;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("changePageActive", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    public final void v3(KFY kfy) {
        int i;
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            i = LIZ.hashCode();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        try {
            Uri.Builder buildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageOrderStoreTab).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            if (valueOf == null) {
                valueOf = "";
            }
            buildUpon.appendQueryParameter("container_unique_id", valueOf);
            buildUpon.appendQueryParameter("use_forest", "1");
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
            buildUpon.appendQueryParameter("enable_code_cache", "1");
            str = buildUpon.toString();
            o.LJIIIIZZ(str, "{\n            val schema…lder.toString()\n        }");
        } catch (Throwable unused) {
            str = "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Forder-list-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1";
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        C51396KFc.LIZIZ(kfy, dynamicPatch, null, 6);
    }
}
