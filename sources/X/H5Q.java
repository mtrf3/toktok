package X;

import Y.IDComparatorS35S0000000_7;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5Q {
    public static final ArrayList<CreateAnchorInfo> LIZ = new ArrayList<>();

    public static java.util.Map LIZ(VideoPublishEditModel args) {
        boolean z;
        String str;
        o.LJIIIZ(args, "args");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(args.getStickers()) && !TextUtils.isEmpty(args.getPropSource())) {
            H7P.LIZIZ(args, arrayList);
        }
        if (H7P.LJI(args, arrayList)) {
            arrayList.addAll(H7P.LJFF(args));
        }
        if (args.getTextStickerDataList() != null) {
            H7P.LIZJ(args, arrayList);
        }
        if (VoiceConversionRecordService.LJ().LIZJ()) {
            H7P.LIZLLL(args, arrayList);
        }
        if (C53258KvG.LIZ() == 4) {
            H5T.LJFF(args, arrayList);
            H5T.LIZLLL(args, arrayList);
        }
        H5T.LJIIIIZZ(args, arrayList);
        H5T.LIZIZ(args, arrayList);
        H5T.LJII(args, arrayList);
        int i = 0;
        if (args.getMainBusinessContext() != null) {
            List LIZLLL = C164826dS.LIZLLL(args.getMainBusinessContext(), EnumC164816dR.TRACK_PAGE_EDIT);
            if (LIZLLL == null) {
                LIZLLL = new ArrayList();
            }
            arrayList.addAll(C68W.LJIIIZ(LIZLLL));
            arrayList.addAll(C68W.LJ(LIZLLL));
        }
        if (args.mPoiData != null) {
            try {
                C42006GeA.LIZ(args, arrayList);
            } catch (Exception unused) {
                C36922EeM.LIZLLL(2, "poi", "add poi params failed");
            }
        }
        Iterator it = ((ArrayList) C78605Ut7.LJIIZILJ()).iterator();
        while (it.hasNext()) {
            ((GTK) it.next()).LIZ(args, new LinkedHashMap<>(), arrayList);
        }
        Collections.reverse(arrayList);
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS35S0000000_7(12));
        }
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("anchor_type", ORZ.LLD(arrayList, ",", null, null, H5P.LJLIL, 30));
            linkedHashMap.put("main_anchor_type", C42891GsR.LIZ(((CreateAnchorInfo) ORZ.LJLLJ(arrayList)).getType()));
            linkedHashMap.put("anchor_name", ORZ.LLD(arrayList, ",", null, null, H5O.LJLIL, 30));
            CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) ORZ.LJLLLL(arrayList);
            if (createAnchorInfo != null && createAnchorInfo.getType() == EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "Lemon8 | app";
            } else if (createAnchorInfo == null || (str = createAnchorInfo.getKeyword()) == null) {
                str = "";
            }
            linkedHashMap.put("main_anchor_name", str);
            if (arrayList.size() > 1) {
                i = 1;
            }
            linkedHashMap.put("multi_anchor", String.valueOf(i));
        }
        linkedHashMap.put("anchor_number", String.valueOf(arrayList.size()));
        return linkedHashMap;
    }
}
