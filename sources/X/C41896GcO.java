package X;

import Y.ACallableS9S0500000_7;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GcO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41896GcO {
    public final Context LIZ;
    public final InterfaceC41894GcM LIZIZ;
    public final C42190Gh8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final void LIZ(AwemeDraft awemeDraft) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        ArrayList<TimeSpeedModelExtension> LJIIJJI;
        int i;
        List<String> list;
        String str;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        if (awemeDraft != null) {
            if (TextUtils.isEmpty(awemeDraft.LJJIIJZLJL)) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJI.multiEditVideoData;
                if (multiEditVideoStatusRecordData != null) {
                    arrayList2 = multiEditVideoStatusRecordData.editCutSegments;
                } else {
                    arrayList2 = null;
                }
                if (C32151Nz.LJJIIJZLJL(arrayList2)) {
                    return;
                }
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = awemeDraft.LJJJJI.multiEditVideoData;
            if (multiEditVideoStatusRecordData2 != null) {
                arrayList = multiEditVideoStatusRecordData2.editCutSegments;
            } else {
                arrayList = null;
            }
            if (C32151Nz.LJJIIZI(arrayList)) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = awemeDraft.LJJJJI.multiEditVideoData;
                if (multiEditVideoStatusRecordData3 != null) {
                    LJIIJJI = multiEditVideoStatusRecordData3.editCutSegments;
                } else {
                    LJIIJJI = null;
                }
            } else {
                LJIIJJI = CameraComponentModel.LJIIJJI(awemeDraft.LJJIIJZLJL);
            }
            awemeDraft.LIZ();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("videoList size:");
            if (LJIIJJI != null) {
                i = LJIIJJI.size();
            } else {
                i = -1;
            }
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            if (LJIIJJI != null) {
                Iterator<TimeSpeedModelExtension> it = LJIIJJI.iterator();
                while (it.hasNext()) {
                    TimeSpeedModelExtension next = it.next();
                    SavePhotoStickerInfo savePhotoStickerInfo = next.getSavePhotoStickerInfo();
                    if (savePhotoStickerInfo != null) {
                        list = savePhotoStickerInfo.getCapturedPhotoPaths();
                    } else {
                        list = null;
                    }
                    if (!C77413UZt.LJIILL(list) && next.getStickerId() != null) {
                        String stickerId = next.getStickerId();
                        o.LJIIIIZZ(stickerId, "videoInfo.stickerId");
                        String LIZJ = C173786ru.LIZJ(stickerId);
                        SavePhotoStickerInfo savePhotoStickerInfo2 = next.getSavePhotoStickerInfo();
                        if (savePhotoStickerInfo2 == null || (str = savePhotoStickerInfo2.getStickerToast()) == null) {
                            str = "";
                        }
                        if (list != null) {
                            for (String str2 : list) {
                                if (C1B6.LIZIZ(str2)) {
                                    arrayList4.add(new C41897GcP(str2, LIZJ, str));
                                }
                            }
                        }
                    }
                }
            }
            if (!(true ^ arrayList4.isEmpty())) {
                return;
            }
            C10K.LIZJ(new ACallableS9S0500000_7(this, awemeDraft, arrayList4, new AtomicInteger(0), arrayList3, 0));
        }
    }

    public C41896GcO(Context context, C41893GcL c41893GcL) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = c41893GcL;
        this.LIZJ = new C42190Gh8(context);
        this.LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 532));
    }

    public final void LIZIZ(CreativeInfo creativeInfo, List<C41897GcP> list, AtomicInteger atomicInteger, ArrayList<C41897GcP> arrayList) {
        int i = atomicInteger.get();
        if (i >= list.size()) {
            if (!arrayList.isEmpty()) {
                C173786ru.LIZLLL(creativeInfo);
            }
            this.LIZIZ.LIZ(arrayList);
            return;
        }
        C41897GcP c41897GcP = (C41897GcP) ListProtector.get(list, i);
        C41895GcN c41895GcN = new C41895GcN(arrayList, c41897GcP, atomicInteger, this, creativeInfo, list);
        C42190Gh8 c42190Gh8 = this.LIZJ;
        String srcPath = c41897GcP.LIZ;
        String str = c41897GcP.LIZIZ;
        AqS111S0300000_7 aqS111S0300000_7 = new AqS111S0300000_7(c41895GcN, c41897GcP, this, 25);
        c42190Gh8.getClass();
        o.LJIIIZ(srcPath, "srcPath");
        C42190Gh8.LIZ(srcPath, new AqS49S1200000_7(aqS111S0300000_7, c42190Gh8, str, 2));
    }
}
