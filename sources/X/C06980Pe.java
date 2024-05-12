package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.0Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06980Pe {
    public final LinkedHashMap<String, String> LIZ = new LinkedHashMap<>(64);

    public final void LIZIZ(C0NR c0nr, List<C07000Pg> list) {
        String str = c0nr.getName() + "_limit_rule";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) list).size()) {
                LJ(str, sb.toString());
                return;
            }
            C07000Pg c07000Pg = (C07000Pg) ListProtector.get(list, i);
            sb.append("(0:");
            c07000Pg.getClass();
            sb.append(c07000Pg.LIZ);
            sb.append(":");
            sb.append(c07000Pg.LIZIZ);
            sb.append(",");
            boolean z = c07000Pg.LIZJ;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            sb.append(z ? "1" : CardStruct.IStatusCode.DEFAULT);
            sb.append(":");
            sb.append(c07000Pg.LIZLLL);
            sb.append(",");
            if (c07000Pg.LJ) {
                str2 = "1";
            }
            sb.append(str2);
            sb.append(":");
            sb.append(c07000Pg.LJFF);
            sb.append(")");
            if (i != r7.size() - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    public final void LIZLLL(C07010Ph c07010Ph) {
        LJ("task_priority_limit_rule", c07010Ph.LIZ + "," + c07010Ph.LIZIZ + ",1");
    }

    public final void LJFF(java.util.Set<C0NR> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((HashSet) set).iterator();
        while (it.hasNext()) {
            sb.append(((C0NR) it.next()).getIndex());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        LJ("support_capability_set", sb.toString());
    }

    public final java.util.Set<C0NR> LIZ() {
        String str = this.LIZ.get("support_capability_set");
        if (str == null) {
            return null;
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        HashSet hashSet = new HashSet();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            hashSet.add(C0NR.valueOf(CastIntegerProtector.parseInt(it.next())));
        }
        if (hashSet.size() == 0) {
            return null;
        }
        return hashSet;
    }

    public final void LIZJ(EnumC06990Pf enumC06990Pf) {
        String num = Integer.toString(enumC06990Pf.ordinal());
        this.LIZ.remove("cpu_core_limit_by");
        this.LIZ.put("cpu_core_limit_by", num);
    }

    public final void LJ(String str, String str2) {
        if (str.indexOf(61) != -1 || str.indexOf(59) != -1 || str.indexOf(0) != -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Key \"");
            LIZ.append(str);
            LIZ.append("\" contains invalid character (= or ; or \\0)");
            X1D.LIZIZ(LIZ);
        } else if (str2.indexOf(61) != -1 || str2.indexOf(59) != -1 || str2.indexOf(0) != -1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Value \"");
            LIZ2.append(str2);
            LIZ2.append("\" contains invalid character (= or ; or \\0)");
            X1D.LIZIZ(LIZ2);
        } else {
            this.LIZ.remove(str);
            this.LIZ.put(str, str2);
            return;
        }
        C0YN.LIZ(6);
    }
}
