package com.bytedance.ies.powerpermissions;

import X.ActivityC45651qj;
import X.C164906da;
import X.C17J;
import X.C1B3;
import X.C61101NyT;
import X.C76800UCe;
import X.C78598Ut0;
import X.EnumC61598OFm;
import X.InterfaceC61105NyX;
import X.InterfaceC61107NyZ;
import X.OHI;
import X.OHL;
import X.OHO;
import X.OHQ;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FakeFragment extends Fragment implements InterfaceC61105NyX {
    public int LJLIL;
    public InterfaceC61107NyZ LJLILLLLZI;
    public C61101NyT LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final HashSet<String> LJLJI = new HashSet<>();
    public final HashSet<String> LJLJJI = new HashSet<>();
    public final HashSet<String> LJLJJL = new HashSet<>();

    public final void wl() {
        FragmentManager supportFragmentManager;
        C17J.LJJJJLI(12);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(this);
            c1b3.LJI();
        }
        if (mo49getActivity instanceof FakeActivity) {
            FakeActivity fakeActivity = (FakeActivity) mo49getActivity;
            if (!fakeActivity.isFinishing()) {
                fakeActivity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.InterfaceC61105NyX
    public final void c4() {
        wl();
    }

    @Override // X.InterfaceC61105NyX
    public final void i0() {
        wl();
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC61105NyX
    public final void Ig(List<String> list) {
        boolean z;
        Context context;
        Intent LIZ;
        o.LJIIIZ(list, OHQ.LIZIZ);
        this.LJLJI.clear();
        this.LJLJJL.clear();
        this.LJLJJI.clear();
        this.LJLIL++;
        Iterator<String> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Context context2 = getContext();
            if (context2 != null) {
                OHI.LIZ.getClass();
                if (OHI.LJ(context2, next)) {
                    this.LJLJI.add(next);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    if (!o.LJ("android.permission.SYSTEM_ALERT_WINDOW", next) && !o.LJ("android.permission.ACCESS_NOTIFICATION_POLICY", next) && !o.LJ("android.permission.MANAGE_EXTERNAL_STORAGE", next)) {
                        this.LJLJJI.add(next);
                    }
                    this.LJLJJL.add(next);
                } else {
                    if (!o.LJ("android.permission.SYSTEM_ALERT_WINDOW", next) && !o.LJ("android.permission.MANAGE_EXTERNAL_STORAGE", next)) {
                        this.LJLJJI.add(next);
                    }
                    this.LJLJJL.add(next);
                }
            }
        }
        if (mo49getActivity() != null) {
            HashSet<String> hashSet = this.LJLJJL;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Iterator<String> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String value = it3.next();
                o.LJIIIIZZ(value, "value");
                OHO LIZ2 = OHL.LIZ(value);
                if (LIZ2 != null && (context = getContext()) != null && (LIZ = LIZ2.LIZ(context)) != null) {
                    int i = this.LJLIL;
                    C78598Ut0.LJIJJ(LIZ, this);
                    startActivityForResult(LIZ, i);
                    C17J.LJJJJLI(3);
                    z = true;
                }
            }
            if (!z) {
                xl(this.LJLJJI);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17J.LJJJJLI(15);
        C61101NyT c61101NyT = this.LJLJJLL;
        if (c61101NyT != null) {
            c61101NyT.LIZIZ();
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        wl();
    }

    public final void xl(HashSet<String> hashSet) {
        C17J.LJJJJLI(4);
        if (hashSet.isEmpty()) {
            C17J.LJJJJLI(5);
            vl(null, null);
        } else {
            requestPermissions((String[]) hashSet.toArray(new String[0]), this.LJLIL);
        }
    }

    public final void vl(int[] iArr, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String key = strArr[i];
                if (iArr != null && iArr[i] == -1) {
                    o.LJIIIZ(key, "key");
                    if (o.LJ(key, "android.permission.READ_CONTACTS")) {
                        Keva.getRepo("FriendsSharePreferences").storeBoolean("read_contact_denied", true);
                    } else {
                        Keva.getRepo("permission_store").storeBoolean(key, true);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            if (true ^ this.LJLJI.isEmpty()) {
                Iterator<String> it = this.LJLJI.iterator();
                while (it.hasNext()) {
                    String str = it.next();
                    o.LJIIIIZZ(str, "str");
                    arrayList.add(new C164906da(str, EnumC61598OFm.GRANTED));
                }
            }
            if (strArr != null && iArr != null) {
                int length2 = strArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (iArr[i2] == 0) {
                        arrayList.add(new C164906da(strArr[i2], EnumC61598OFm.GRANTED));
                    } else {
                        OHI ohi = OHI.LIZ;
                        String str2 = strArr[i2];
                        ohi.getClass();
                        if (OHI.LJI(mo49getActivity, str2)) {
                            arrayList.add(new C164906da(strArr[i2], EnumC61598OFm.DENIED_PERMANENT));
                        } else {
                            arrayList.add(new C164906da(strArr[i2], EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED));
                        }
                    }
                }
            }
            Iterator<String> it2 = this.LJLJJL.iterator();
            while (it2.hasNext()) {
                String value = it2.next();
                OHI ohi2 = OHI.LIZ;
                o.LJIIIIZZ(value, "value");
                ohi2.getClass();
                if (OHI.LJ(mo49getActivity, value)) {
                    arrayList.add(new C164906da(value, EnumC61598OFm.GRANTED));
                } else if (OHI.LJI(mo49getActivity, value)) {
                    arrayList.add(new C164906da(value, EnumC61598OFm.DENIED_PERMANENT));
                } else {
                    arrayList.add(new C164906da(value, EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED));
                }
            }
            C17J.LJJJJLI(11);
            InterfaceC61107NyZ interfaceC61107NyZ = this.LJLILLLLZI;
            if (interfaceC61107NyZ != null) {
                C164906da[] c164906daArr = (C164906da[]) arrayList.toArray(new C164906da[0]);
                interfaceC61107NyZ.LIZIZ((C164906da[]) Arrays.copyOf(c164906daArr, c164906daArr.length));
            }
            C61101NyT c61101NyT = this.LJLJJLL;
            if (c61101NyT != null) {
                c61101NyT.LIZIZ();
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            wl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.LJLIL) {
            new Handler().postDelayed(new ARunnableS46S0100000_10(this, 19), 300L);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        C17J.LJJJJLI(6);
        int i2 = this.LJLIL;
        if (i != i2 || strArr.length == 0 || grantResults.length == 0) {
            if (i == i2) {
                C17J.LJJJJLI(8);
                return;
            } else if (strArr.length == 0) {
                C17J.LJJJJLI(10);
                return;
            } else {
                C17J.LJJJJLI(9);
                return;
            }
        }
        C17J.LJJJJLI(7);
        vl(grantResults, strArr);
    }
}
