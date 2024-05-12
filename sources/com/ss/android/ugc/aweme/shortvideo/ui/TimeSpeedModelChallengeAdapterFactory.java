package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C47261Igj;
import X.C65385PlN;
import X.C65389PlR;
import X.C65394PlW;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TimeSpeedModelChallengeAdapterFactory implements u {

    /* loaded from: classes12.dex */
    public static final class TimeSpeedModelChallengeAdapter extends TypeAdapter<List<? extends AVChallenge>> {
        public final TypeAdapter<AVChallenge> LIZ;

        public TimeSpeedModelChallengeAdapter(Gson gson) {
            o.LJIIIZ(gson, "gson");
            this.LIZ = gson.LJIIJ(AVChallenge.class);
        }

        @Override // com.google.gson.TypeAdapter
        public final List<? extends AVChallenge> read(C65385PlN c65385PlN) {
            if (c65385PlN == null) {
                return null;
            }
            EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
            if (LJJIJIL != null) {
                int i = C65389PlR.LIZ[LJJIJIL.ordinal()];
                if (i == 1) {
                    return null;
                }
                if (i != 2) {
                    if (i == 3) {
                        AVChallenge read = this.LIZ.read(c65385PlN);
                        o.LJIIIIZZ(read, "elementAdapter.read(it)");
                        return C47261Igj.LJJIJ(read);
                    }
                } else {
                    c65385PlN.LIZ();
                    ArrayList arrayList = new ArrayList();
                    while (c65385PlN.LJIIJJI()) {
                        AVChallenge read2 = this.LIZ.read(c65385PlN);
                        o.LJIIIIZZ(read2, "elementAdapter.read(it)");
                        arrayList.add(read2);
                    }
                    c65385PlN.LJ();
                    return arrayList;
                }
            }
            throw new n("Expected JSON ARRAY or JSON OBJECT ");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, List<? extends AVChallenge> list) {
            List<? extends AVChallenge> list2 = list;
            if (c65403Plf != null) {
                if (list2 != null) {
                    c65403Plf.LIZIZ();
                    Iterator<? extends AVChallenge> it = list2.iterator();
                    while (it.hasNext()) {
                        this.LIZ.write(c65403Plf, it.next());
                    }
                    c65403Plf.LJ();
                    return;
                }
                c65403Plf.LJIIJJI();
            }
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        if ((!o.LJ(type, new C65394PlW())) && (!o.LJ(type.getRawType(), AVChallenge.class))) {
            return null;
        }
        return new TimeSpeedModelChallengeAdapter(gson);
    }
}
