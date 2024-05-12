package com.bytedance.hybrid.spark.page;

import X.AbstractC60800Ntc;
import X.AbstractC60811Ntn;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C117144ik;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C29S;
import X.C37682Eqc;
import X.C38262Ezy;
import X.C39836FkG;
import X.C39858Fkc;
import X.C3C5;
import X.C40343FsR;
import X.C40347FsV;
import X.C60723NsN;
import X.C60792NtU;
import X.C60801Ntd;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC40159FpT;
import X.InterfaceC60761Nsz;
import X.InterfaceC60813Ntp;
import X.InterfaceC60818Ntu;
import X.NV7;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class SparkFragment extends Fragment implements NV7, InterfaceC40159FpT {
    public static final boolean LL;
    public final boolean LJLIL;
    public View LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public C60723NsN LJLJJI;
    public SparkContext LJLJJL;
    public SparkSchemaParam LJLJJLL;
    public AbstractC60800Ntc LJLJL;
    public boolean LJLJLJ;
    public AbstractC60811Ntn LJLJLLL;
    public InterfaceC60813Ntp LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;

    static {
        Object LIZ;
        boolean z;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("optimize_spark_fragment_memory_leak");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        LL = z;
    }

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void finish() {
        String str;
        this.LJZI = true;
        C117144ik c117144ik = C117144ik.LIZIZ;
        SparkContext sparkContext = this.LJLJJL;
        if (sparkContext != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        c117144ik.getClass();
        Map<String, SparkContext> map = C117144ik.LIZ;
        if (str == null) {
            str = "";
        }
        map.remove(str);
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.NV7
    public final void refresh() {
        C37682Eqc.LIZIZ(this.LJLJJL, "SparkFragment", "refresh");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    public SparkFragment() {
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 26));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 24));
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 25));
        C40343FsR.LJIILJJIL.LJIIIZ();
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        Integer num;
        try {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJJI(this);
                num = Integer.valueOf(c1b3.LJIILL(true));
            } else {
                num = null;
            }
            C3C5.m7constructorimpl(num);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        InterfaceC40159FpT interfaceC40159FpT;
        super.onDestroy();
        if (LL) {
            SparkContext sparkContext = this.LJLJJL;
            if (sparkContext != null) {
                interfaceC40159FpT = sparkContext.LJIILL();
            } else {
                interfaceC40159FpT = null;
            }
            if (interfaceC40159FpT instanceof SparkFragment) {
                this.LJZI = true;
            }
        }
        wl(this.LJZI);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        super.onPause();
        if (this.LJZL && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        super.onResume();
        if (this.LJZL && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
    }

    public SparkFragment(int i) {
        this();
        this.LJLIL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r1.LJJJLIIL(r3.LJLJJL);
        r1 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if ((r1 instanceof X.AbstractC60811Ntn) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r3.LJLJJL = null;
        r3.LJLJI = null;
        r3.LJZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wl(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJZ
            if (r0 == 0) goto L5
            return
        L5:
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LJLJJL
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.containerId
            if (r1 == 0) goto L17
            X.FcZ r0 = com.bytedance.hybrid.spark.SparkContext.Companion
            r0.getClass()
            java.util.Map<java.lang.String, X.Nsb> r0 = com.bytedance.hybrid.spark.SparkContext.hybridContextMap
            r0.remove(r1)
        L17:
            X.NtS r0 = r3.LJLJI
            if (r0 == 0) goto L1e
            r0.LJFF(r4)
        L1e:
            X.Ntc r1 = r3.LJLJL
            if (r1 == 0) goto L27
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LJLJJL
            r1.LJJJLIIL(r0)
        L27:
            X.Ntn r1 = r3.LJLJLLL
            r2 = 0
            if (r1 == 0) goto L40
        L2c:
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LJLJJL
            r1.LJJJLIIL(r0)
            java.lang.Object r1 = r1.next()
            if (r1 == 0) goto L40
            boolean r0 = r1 instanceof X.AbstractC60811Ntn
            if (r0 == 0) goto L40
            X.Ntn r1 = (X.AbstractC60811Ntn) r1
            if (r1 == 0) goto L40
            goto L2c
        L40:
            r3.LJLJJL = r2
            r3.LJLJI = r2
            r0 = 1
            r3.LJZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.wl(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        Map<String, Object> commonVarParams;
        int i;
        int i2;
        o.LJIIJ(view, "view");
        super.onViewCreated(view, bundle);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
            SparkSchemaParam sparkSchemaParam = this.LJLJJLL;
            Object obj = null;
            if (sparkSchemaParam != null && sparkSchemaParam.getEnableSparkLiveOpt()) {
                commonVarParams = kitView.getGlobalProps();
            } else {
                C39836FkG.LJII.getClass();
                C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
                if (c39858Fkc != null) {
                    commonVarParams = c39858Fkc.getCommonVarParams(kitView);
                }
            }
            if (commonVarParams != null) {
                Object obj2 = commonVarParams.get("screenWidth");
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                Object obj3 = commonVarParams.get("screenHeight");
                if (obj3 instanceof Integer) {
                    obj = obj3;
                }
                Integer num2 = (Integer) obj;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                    Map<String, ? extends Object> LJJL = C113554cx.LJJL(new OSZ("screenWidth", Integer.valueOf(i)), new OSZ("screenHeight", Integer.valueOf(i2)));
                    InterfaceC60761Nsz interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.LJLIL;
                    if (interfaceC60761Nsz != null) {
                        interfaceC60761Nsz.LIZ(LJJL);
                    }
                }
            }
        }
        if (!this.LJLJLJ && !this.LJLZ && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0176, code lost:
    
        if (r0 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        r0.LJJJJZI(r14);
        r0 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017d, code lost:
    
        if (r0 == null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02b2, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b4, code lost:
    
        if (r0 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b6, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c0, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(r14, r0)) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02c2, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c4, code lost:
    
        if (r0 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c6, code lost:
    
        r1 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ca, code lost:
    
        if (r1 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cc, code lost:
    
        r5 = (X.AbstractC60800Ntc) r1.LIZIZ(X.AbstractC60800Ntc.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d4, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d6, code lost:
    
        if (r0 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d8, code lost:
    
        r1 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02dc, code lost:
    
        if (r1 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02de, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1.LIZIZ(X.AbstractC60811Ntn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e6, code lost:
    
        if (r5 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e8, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ea, code lost:
    
        if (r0 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ec, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02f0, code lost:
    
        r5.LJJJJZI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0307, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f3, code lost:
    
        if (r1 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f5, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f7, code lost:
    
        if (r0 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f9, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02fd, code lost:
    
        r1.LJJJJZI(r0);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0302, code lost:
    
        if (r1 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0305, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0309, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x030b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x030f, code lost:
    
        r0 = r12.LJLJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0311, code lost:
    
        if (r0 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0313, code lost:
    
        r0.LJJJLZIJ(r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0316, code lost:
    
        r0 = r12.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0318, code lost:
    
        if (r0 == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031a, code lost:
    
        r0.LJJJLZIJ(r14, r4);
        r0 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031f, code lost:
    
        if (r0 == null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0322, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0324, code lost:
    
        if (r0 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0326, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x032f, code lost:
    
        if ((true ^ kotlin.jvm.internal.o.LJ(r14, r0)) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0331, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0333, code lost:
    
        if (r0 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0335, code lost:
    
        r1 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0339, code lost:
    
        if (r1 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x033b, code lost:
    
        r2 = (X.AbstractC60800Ntc) r1.LIZIZ(X.AbstractC60800Ntc.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0343, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0345, code lost:
    
        if (r0 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0347, code lost:
    
        r1 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x034b, code lost:
    
        if (r1 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x034d, code lost:
    
        r1 = (X.AbstractC60811Ntn) r1.LIZIZ(X.AbstractC60811Ntn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0355, code lost:
    
        if (r2 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0357, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0359, code lost:
    
        if (r0 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x035b, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x035f, code lost:
    
        r2.LJJJLZIJ(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0376, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0362, code lost:
    
        if (r1 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0364, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0366, code lost:
    
        if (r0 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0368, code lost:
    
        r0 = r0.getOriginalSparkContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x036c, code lost:
    
        r1.LJJJLZIJ(r0, r4);
        r1 = r1.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0371, code lost:
    
        if (r1 == null) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0374, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0378, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037e, code lost:
    
        r0 = r12.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0380, code lost:
    
        if (r0 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0382, code lost:
    
        r4 = r0.getKitView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0386, code lost:
    
        if (r4 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0388, code lost:
    
        r2 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0391, code lost:
    
        if (r6 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0393, code lost:
    
        r0 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0395, code lost:
    
        r2.put("isPreload", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039a, code lost:
    
        if (r8 == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x039c, code lost:
    
        r0 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x039e, code lost:
    
        r2.put("isReUse", r0);
        r4.LJIIIZ("sparkViewMounted", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03c3, code lost:
    
        r0 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c6, code lost:
    
        r0 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a6, code lost:
    
        if (r12.LJZL == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03a8, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ac, code lost:
    
        if (r14 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ae, code lost:
    
        r1 = r14.containerId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03b0, code lost:
    
        if (r1 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03b2, code lost:
    
        X.FD5.LIZJ(r2, r1, "container_init_end");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03b7, code lost:
    
        if (r14 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03b9, code lost:
    
        r14.LIZIZ(X.C60728NsS.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c0, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x037c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x030d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(android.content.Context r13, com.bytedance.hybrid.spark.SparkContext r14) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkFragment.vl(android.content.Context, com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        InterfaceC60813Ntp interfaceC60813Ntp;
        InterfaceC60818Ntu interfaceC60818Ntu;
        String str2;
        boolean z;
        Context context;
        ViewParent parent;
        Integer LJIJI;
        SparkSchemaParam LJIIZILJ;
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context2 = getContext();
        C29S c29s = null;
        if (context2 != null) {
            C117144ik c117144ik = C117144ik.LIZIZ;
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("SparkContextContainerId");
            } else {
                str = null;
            }
            c117144ik.getClass();
            SparkContext LIZ = C117144ik.LIZ(str);
            vl(context2, LIZ);
            if (LIZ != null) {
                interfaceC60813Ntp = (InterfaceC60813Ntp) LIZ.LIZIZ(InterfaceC60813Ntp.class);
            } else {
                interfaceC60813Ntp = null;
            }
            this.LJLL = interfaceC60813Ntp;
            if (LIZ != null && (interfaceC60818Ntu = (InterfaceC60818Ntu) LIZ.LIZIZ(InterfaceC60818Ntu.class)) != null) {
                this.LJLLL = interfaceC60818Ntu.LIZIZ();
                this.LJLLLL = interfaceC60818Ntu.LIZ();
                this.LJLLLLLL = interfaceC60818Ntu.getStatusView();
            } else {
                interfaceC60818Ntu = null;
            }
            InterfaceC60813Ntp interfaceC60813Ntp2 = this.LJLL;
            if (interfaceC60813Ntp2 == null && interfaceC60818Ntu == null) {
                if (this.LJLIL) {
                    view = this.LJLJJI;
                } else {
                    view = this.LJLJI;
                }
                this.LJLILLLLZI = view;
            } else {
                if (interfaceC60813Ntp2 == null) {
                    interfaceC60813Ntp2 = new C60801Ntd();
                }
                this.LJLL = interfaceC60813Ntp2;
                if (LIZ != null && (LJIIZILJ = LIZ.LJIIZILJ(-1)) != null) {
                    str2 = LJIIZILJ.getForceThemeStyle();
                } else {
                    str2 = null;
                }
                if (str2 == null || ujb.o.LJJJJJL(str2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && LIZ != null && (LJIJI = LIZ.LJIJI(null)) != null) {
                    context = new C40347FsV(context2, LJIJI.intValue());
                } else {
                    context = context2;
                }
                if (context != context2) {
                    inflater = inflater.cloneInContext(context);
                    o.LJFF(inflater, "inflater.cloneInContext(contextWrapper)");
                }
                this.LJLILLLLZI = interfaceC60813Ntp2.LIZJ(inflater, viewGroup);
                ViewGroup viewGroup2 = (ViewGroup) this.LJLLJ.getValue();
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent()) != null) {
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        if (parent != null) {
                            C16880lQ.LJLLL(this.LJLJI, (ViewGroup) parent);
                        }
                    }
                    viewGroup2.addView(this.LJLJI);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.LJLLI.getValue();
                if (viewGroup3 != null) {
                    viewGroup3.removeAllViews();
                }
                View view2 = this.LJLLL;
                if (view2 != null) {
                    C60792NtU.LIZ.getClass();
                    C60792NtU.LJ(view2);
                    ViewGroup viewGroup4 = (ViewGroup) this.LJLLI.getValue();
                    if (viewGroup4 != null) {
                        viewGroup4.addView(view2);
                    }
                }
                ViewGroup viewGroup5 = (ViewGroup) this.LJLLILLLL.getValue();
                if (viewGroup5 != null) {
                    viewGroup5.removeAllViews();
                }
                View view3 = this.LJLLLL;
                if (view3 != null) {
                    C60792NtU.LIZ.getClass();
                    C60792NtU.LJ(view3);
                    ViewGroup viewGroup6 = (ViewGroup) this.LJLLILLLL.getValue();
                    if (viewGroup6 != null) {
                        viewGroup6.addView(view3);
                    }
                }
            }
        }
        View view4 = this.LJLILLLLZI;
        if (!(view4 instanceof View)) {
            view4 = null;
        }
        if (view4 != null) {
            try {
                ViewTreeLifecycleOwner.set(view4, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view4, this);
                C10A.LIZIZ(view4, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view4;
    }
}
