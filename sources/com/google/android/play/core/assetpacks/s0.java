package com.google.android.play.core.assetpacks;

import X.C64075PCt;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final /* synthetic */ class s0 implements b1 {
    public final Object LIZ;
    public final Object LIZIZ;

    @Override // com.google.android.play.core.assetpacks.b1
    public final Object a() {
        a1 a1Var;
        boolean z;
        c1 c1Var = (c1) this.LIZ;
        Bundle bundle = (Bundle) this.LIZIZ;
        c1Var.getClass();
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, z0> map = c1Var.LJ;
        Integer valueOf = Integer.valueOf(i);
        if (((HashMap) map).containsKey(valueOf)) {
            z0 LIZJ = c1Var.LIZJ(i);
            int i2 = bundle.getInt(C64075PCt.LIZ("status", LIZJ.LIZJ.LIZ));
            if (l1.LIZLLL(LIZJ.LIZJ.LIZJ, i2)) {
                c1.LJI.LIZJ("Found stale update for session %s with status %d.", 3, new Object[]{valueOf, Integer.valueOf(LIZJ.LIZJ.LIZJ)});
                y0 y0Var = LIZJ.LIZJ;
                String str = y0Var.LIZ;
                int i3 = y0Var.LIZJ;
                if (i3 == 4) {
                    c1Var.LIZIZ.a().LIZJ(i, str);
                } else if (i3 == 5) {
                    c1Var.LIZIZ.a().LIZIZ(i);
                } else if (i3 == 6) {
                    c1Var.LIZIZ.a().LJFF(Arrays.asList(str));
                }
            } else {
                y0 y0Var2 = LIZJ.LIZJ;
                y0Var2.LIZJ = i2;
                if (i2 == 5 || i2 == 6 || i2 == 4) {
                    c1Var.LIZIZ(new w0(i, c1Var));
                    c1Var.LIZJ.LIZ(LIZJ.LIZJ.LIZ);
                } else {
                    for (a1 a1Var2 : y0Var2.LJ) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C64075PCt.LIZIZ("chunk_intents", LIZJ.LIZJ.LIZ, a1Var2.LIZ));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (ListProtector.get(parcelableArrayList, i4) != null && ((Intent) ListProtector.get(parcelableArrayList, i4)).getData() != null) {
                                    ((x0) ListProtector.get(a1Var2.LIZLLL, i4)).LIZ = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String LIZLLL = c1.LIZLLL(bundle);
            long j = bundle.getLong(C64075PCt.LIZ("pack_version", LIZLLL));
            int i5 = bundle.getInt(C64075PCt.LIZ("status", LIZLLL));
            long j2 = bundle.getLong(C64075PCt.LIZ("total_bytes_to_download", LIZLLL));
            List<String> stringArrayList = bundle.getStringArrayList(C64075PCt.LIZ("slice_ids", LIZLLL));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List parcelableArrayList2 = bundle.getParcelableArrayList(C64075PCt.LIZIZ("chunk_intents", LIZLLL, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new x0(z));
                }
                String string = bundle.getString(C64075PCt.LIZIZ("uncompressed_hash_sha256", LIZLLL, str2));
                long j3 = bundle.getLong(C64075PCt.LIZIZ("uncompressed_size", LIZLLL, str2));
                int i6 = bundle.getInt(C64075PCt.LIZIZ("patch_format", LIZLLL, str2), 0);
                if (i6 != 0) {
                    a1Var = new a1(str2, string, j3, arrayList2, 0, i6);
                } else {
                    a1Var = new a1(str2, string, j3, arrayList2, bundle.getInt(C64075PCt.LIZIZ("compression_format", LIZLLL, str2), 0), 0);
                }
                arrayList.add(a1Var);
            }
            ((HashMap) c1Var.LJ).put(Integer.valueOf(i), new z0(i, bundle.getInt("app_version_code"), new y0(i5, j, j2, LIZLLL, arrayList)));
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ s0(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
