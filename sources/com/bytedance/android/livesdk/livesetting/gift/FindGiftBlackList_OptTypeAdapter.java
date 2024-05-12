package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FindGiftBlackList_OptTypeAdapter extends TypeAdapter<FindGiftBlackList> {
    public final Gson LIZ;

    public FindGiftBlackList_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FindGiftBlackList read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FindGiftBlackList findGiftBlackList = new FindGiftBlackList(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "black_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Long.TYPE);
                    o.LJI(LIZ);
                    findGiftBlackList.blackList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return findGiftBlackList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FindGiftBlackList findGiftBlackList) {
        FindGiftBlackList findGiftBlackList2 = findGiftBlackList;
        o.LJIIIZ(writer, "writer");
        if (findGiftBlackList2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("black_list");
        C65412Plo.LIZLLL(this.LIZ, writer, findGiftBlackList2.blackList, Long.TYPE);
        writer.LJFF();
    }
}
