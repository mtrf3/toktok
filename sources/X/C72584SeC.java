package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SeC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72584SeC {
    public static C72585SeD LIZ(m mVar) {
        EnumC46494IMo enumC46494IMo;
        boolean z;
        String LJJIFFI;
        C72556Sdk c72556Sdk;
        C72549Sdd c72549Sdd;
        try {
            if (mVar.LJJIJLIJ("type")) {
                if (o.LJ(mVar.LJJIJ("type").LJJIFFI(), "color_picker")) {
                    enumC46494IMo = EnumC46494IMo.COLOR_PICKER;
                } else {
                    enumC46494IMo = EnumC46494IMo.GRID;
                }
            } else {
                enumC46494IMo = EnumC46494IMo.GRID;
            }
            String LJJIFFI2 = mVar.LJJIJ("key").LJJIFFI();
            o.LJIIIIZZ(LJJIFFI2, "jsonObject[PROPERTY_KEY].asString");
            String LJJIFFI3 = mVar.LJJIJ("name").LJJIFFI();
            o.LJIIIIZZ(LJJIFFI3, "jsonObject[PROPERTY_NAME].asString");
            String LJJIFFI4 = mVar.LJJIJ("tab").LJJIFFI();
            o.LJIIIIZZ(LJJIFFI4, "jsonObject[PROPERTY_TAB].asString");
            if (!mVar.LJJIJLIJ("inspirations")) {
                z = true;
            } else {
                z = false;
            }
            C72585SeD c72585SeD = new C72585SeD(LJJIFFI2, LJJIFFI3, enumC46494IMo, LJJIFFI4, z);
            if (mVar.LJJIJLIJ("color_pickers")) {
                C72549Sdd c72549Sdd2 = new C72549Sdd();
                Iterator<j> it = mVar.LJJIJ("color_pickers").LJIILLIIL().iterator();
                while (it.hasNext()) {
                    C72556Sdk LIZ = C72557Sdl.LIZ(it.next().LJIIZILJ(), c72585SeD);
                    if (LIZ != null) {
                        c72549Sdd2.LIZ.add(LIZ);
                    }
                }
                c72585SeD.LJII = c72549Sdd2;
                ArrayList<C72556Sdk> arrayList = c72549Sdd2.LIZ;
                if (arrayList != null && (c72556Sdk = (C72556Sdk) ListProtector.get(arrayList, 0)) != null && (c72549Sdd = c72585SeD.LJII) != null) {
                    c72549Sdd.LIZIZ = c72556Sdk;
                }
            }
            if (mVar.LJJIJLIJ("flip")) {
                String LJJIFFI5 = mVar.LJJIJ("flip").LJIIZILJ().LJJIJ("key").LJJIFFI();
                o.LJIIIIZZ(LJJIFFI5, "jsonObject[PROPERTY_FLIP…ct[PROPERTY_KEY].asString");
                c72585SeD.LJIIIIZZ = new C72583SeB(LJJIFFI5);
            }
            if (mVar.LJJIJLIJ("sliders")) {
                Iterator<j> it2 = mVar.LJJIJ("sliders").LJIILLIIL().iterator();
                while (it2.hasNext()) {
                    j next = it2.next();
                    String LJJIFFI6 = next.LJIIZILJ().LJJIJ("key").LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI6, "optionJson.asJsonObject[PROPERTY_KEY].asString");
                    String LJJIFFI7 = next.LJIIZILJ().LJJIJ("name").LJJIFFI();
                    o.LJIIIIZZ(LJJIFFI7, "optionJson.asJsonObject[PROPERTY_NAME].asString");
                    c72585SeD.LJI.put(LJJIFFI6, new C72588SeG(LJJIFFI6, LJJIFFI7, next.LJIIZILJ().LJJIJ("min").LJIILJJIL(), next.LJIIZILJ().LJJIJ("max").LJIILJJIL(), next.LJIIZILJ().LJJIJ("default").LJIILJJIL(), next.LJIIZILJ().LJJIJ("step").LJIILJJIL(), c72585SeD));
                }
            }
            if (mVar.LJJIJLIJ("inspirations")) {
                Iterator<j> it3 = mVar.LJJIJ("inspirations").LJIILLIIL().iterator();
                while (it3.hasNext()) {
                    C72587SeF LIZ2 = C72586SeE.LIZ(it3.next().LJIIZILJ(), c72585SeD);
                    if (LIZ2 != null) {
                        c72585SeD.LJIIIZ.put(LIZ2.LIZ, LIZ2);
                    }
                }
            }
            if (mVar.LJJIJLIJ("group") && (LJJIFFI = mVar.LJJIJ("group").LJJIFFI()) != null && LJJIFFI.length() != 0) {
                c72585SeD.LJIIJ = LJJIFFI;
            }
            return c72585SeD;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
