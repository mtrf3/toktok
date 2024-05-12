package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$resolveMedia$1", f = "SaveDraftByPath.kt", l = {76, 80}, m = "invokeSuspend")
/* renamed from: X.Gd5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41939Gd5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ List<MediaModel> LJLJJI;
    public final /* synthetic */ CreativeInfo LJLJJL;
    public final /* synthetic */ IAVDraftService.SaveDraftByPathParam LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41939Gd5(List<? extends MediaModel> list, CreativeInfo creativeInfo, IAVDraftService.SaveDraftByPathParam saveDraftByPathParam, InterfaceC67352kd<? super C41939Gd5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = creativeInfo;
        this.LJLJJLL = saveDraftByPathParam;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41939Gd5 c41939Gd5 = new C41939Gd5(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c41939Gd5.LJLJI = obj;
        return c41939Gd5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        ArrayList LIZ;
        boolean z;
        boolean z2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z3;
        ArrayList<ImportVideoInfo> arrayList;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LIZ = (ArrayList) this.LJLIL;
            interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
            ArrayList arrayList2 = new ArrayList(this.LJLJJI);
            C44512HdU LIZ2 = C60903NvH.LJIIJJI().LJJIJIL().LIZ(this.LJLJJL);
            LIZ = C43547H7f.LIZ(arrayList2, false, null, 14);
            C84661XKn LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C41938Gd4(LIZ, LIZ2, null), 3);
            this.LJLJI = interfaceC70422pa;
            this.LJLIL = LIZ;
            this.LJLILLLLZI = 1;
            obj2 = LIZIZ.LJJIJ(this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSJ osj = (OSJ) obj2;
        boolean booleanValue = ((Boolean) osj.getFirst()).booleanValue();
        boolean booleanValue2 = ((Boolean) osj.getSecond()).booleanValue();
        long longValue = ((Number) osj.getThird()).longValue();
        if (C48841JEv.LJIILLIIL(interfaceC70422pa) && booleanValue2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SaveDraftByPath");
            LIZ3.append(" -> compress draft finish and save draft");
            H7B.LIZ(X1D.LIZIZ(LIZ3));
            Cut2EditTransferModel cut2EditTransferModel = new Cut2EditTransferModel(booleanValue, false, null, 0L, 0L, longValue, 4, null);
            C41935Gd1 c41935Gd1 = C41935Gd1.LIZ;
            CreativeInfo creativeInfo = this.LJLJJL;
            String shootWay = this.LJLJJLL.getShootWay();
            final VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
            videoPublishEditModel.creativeInfo = creativeInfo;
            videoPublishEditModel.mOrigin = 0;
            videoPublishEditModel.mFromCut = true;
            if (LIZ.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            videoPublishEditModel.mFromMultiCut = z;
            if (LIZ.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoPublishEditModel.mIsMultiVideo = z2;
            videoPublishEditModel.isFastImport = true;
            videoPublishEditModel.mShootWay = shootWay;
            EditPreviewInfo LIZ4 = C6ZR.LIZ(true, HU5.LIZ(creativeInfo), LIZ, new long[]{-1, -1});
            Iterator it = LIZ.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((VideoSegment) it.next()).duration;
            }
            LIZ4.setPreviewVideoLength((int) j);
            videoPublishEditModel.setPreviewInfo(LIZ4);
            MultiEditVideoRecordData LJIIIZ = C46104I7o.LJIIIZ(LIZ4.getVideoList());
            if (LJIIIZ == null) {
                multiEditVideoStatusRecordData = null;
            } else {
                multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                Iterator it2 = LIZ.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += ((VideoSegment) it2.next()).duration;
                }
                LJIIIZ.endTime = Math.min(j2, HEL.LIZ());
                if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                    if (LJIIIZ.segmentDataList.size() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LJIIIZ.isSingleVideo = z3;
                    multiEditVideoStatusRecordData.originMultiEditRecordData = LJIIIZ.cloneData();
                }
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = LJIIIZ;
            }
            videoPublishEditModel.multiEditVideoRecordData = multiEditVideoStatusRecordData;
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            o.LJIIIIZZ(multiEditVideoRecordData, "multiEditVideoRecordData…rMultiEditVideoRecordData");
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(multiEditVideoRecordData);
            o.LJIIIIZZ(videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData.getPlayInOutTime(), "multiEditVideoRecordData…oRecordData.playInOutTime");
            LJIIJJI.setTimeRange(((Number) r4.first).intValue() * 1000, ((Number) r4.second).intValue() * 1000);
            VEUtils.getVideoThumb(LJIIJJI, (int) (videoPublishEditModel.mVideoCoverStartTm * 1000), -1, videoPublishEditModel.videoHeight(), false, new P5A() { // from class: X.6Z8
                @Override // X.P5A
                public final boolean processFrame(ByteBuffer frame, int i2, int i3, int i4) {
                    o.LJIIIZ(frame, "frame");
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(frame.position(0));
                    Bitmap LIZJ = OUR.LIZJ(VideoPublishEditModel.this, createBitmap);
                    if (TextUtils.isEmpty(VideoPublishEditModel.this.multiEditVideoRecordData.coverImagePath)) {
                        VideoPublishEditModel videoPublishEditModel2 = VideoPublishEditModel.this;
                        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel2.multiEditVideoRecordData;
                        CreativeInfo creativeInfo2 = videoPublishEditModel2.creativeInfo;
                        o.LJIIIIZZ(creativeInfo2, "creativeInfo");
                        multiEditVideoStatusRecordData2.coverImagePath = C6BI.LIZJ(creativeInfo2);
                    }
                    String str = VideoPublishEditModel.this.multiEditVideoRecordData.coverImagePath;
                    o.LJIIIIZZ(str, "multiEditVideoRecordData.coverImagePath");
                    C6BI.LIZLLL(LIZJ, str, null);
                    return false;
                }
            });
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LIZ, 10));
            Iterator it3 = LIZ.iterator();
            while (it3.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it3.next();
                int i2 = videoSegment.width;
                int i3 = videoSegment.height;
                int LIZIZ2 = videoSegment.LIZIZ();
                int LIZLLL = videoSegment.LIZLLL();
                String LJII = videoSegment.LJII(true);
                LJII.toString();
                long j3 = videoSegment.duration;
                long LJ = videoSegment.LJ() - videoSegment.LJIIIZ();
                String str = videoSegment.mDescription;
                String str2 = videoSegment.mMusicId;
                int LJI = videoSegment.LJI();
                float LJIIIIZZ = videoSegment.LJIIIIZZ();
                String LJII2 = videoSegment.LJII(false);
                LJII2.toString();
                arrayList3.add(new ImportVideoInfo(i2, i3, LIZIZ2, LIZLLL, LJII, j3, LJ, str, str2, LJI, LJIIIIZZ, LJII2, videoSegment.originPath, videoSegment.fastImportDependHW, null, 16384, null));
            }
            if (arrayList3.isEmpty()) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(arrayList3);
            }
            videoPublishEditModel.importInfoList = arrayList;
            videoPublishEditModel.videoCount = LIZ.size();
            videoPublishEditModel.voiceVolume = 1.0f;
            C60903NvH.LJIIJJI().LJJJI().LJIIIIZZ();
            videoPublishEditModel.setNewVersion(3);
            videoPublishEditModel.cut2EditTransferModel = cut2EditTransferModel;
            videoPublishEditModel.newDraftId = C43081GvV.LIZ();
            C47192Ifc.LIZIZ(videoPublishEditModel).LIZJ(false, false);
            videoPublishEditModel.supportRetake = true;
            ISaveVideoToDraftListener listener = this.LJLJJLL.getListener();
            this.LJLJI = null;
            this.LJLIL = null;
            this.LJLILLLLZI = 2;
            if (c41935Gd1.LIZIZ(videoPublishEditModel, listener, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        this.LJLJJLL.getListener().onFailed(new Exception("compress draft fail"));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
