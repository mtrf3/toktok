package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$resizeMedias$1", f = "ResizeMediasManager.kt", l = {81}, m = "invokeSuspend")
/* renamed from: X.5Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131205Cy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;
    public final /* synthetic */ EnumC43650HBe LJLJJLL;
    public final /* synthetic */ NLEModel LJLJL;
    public final /* synthetic */ Context LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131205Cy(VideoPublishEditModel videoPublishEditModel, EnumC43650HBe enumC43650HBe, NLEModel nLEModel, Context context, InterfaceC67352kd<? super C131205Cy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = videoPublishEditModel;
        this.LJLJJLL = enumC43650HBe;
        this.LJLJL = nLEModel;
        this.LJLJLJ = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131205Cy(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String zipFolder;
        String str;
        Context context;
        Iterator it;
        String str2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.LJLJI;
                context = (Context) this.LJLILLLLZI;
                zipFolder = (String) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
            CreativeInfo creativeInfo = this.LJLJJL.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
            zipFolder = C43073GvN.LIZ(pathService, creativeInfo, this.LJLJJLL, null, 12).getAbsolutePath();
            VecNLETrackSPtr tracks = this.LJLJL.getTracks();
            ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it2.next().LJIILLIIL(), LIZ);
            }
            if (!(!LIZ.isEmpty())) {
                LIZ = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("resizeMedias slots: ");
            if (LIZ != null) {
                str = ORZ.LLD(LIZ, null, null, null, C122624ra.LJLIL, 31);
            } else {
                str = null;
            }
            LIZ2.append(str);
            C5KN.LIZJ(X1D.LIZIZ(LIZ2));
            if (LIZ != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = LIZ.iterator();
                while (it3.hasNext()) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(((NLETrackSlot) it3.next()).LJI());
                    if (LJJ != null) {
                        arrayList3.add(LJJ);
                    }
                }
                Context context2 = this.LJLJLJ;
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) it4.next();
                    NLEResourceAV LJ = nLESegmentAudio.LJ();
                    if (LJ != null) {
                        str2 = LJ.LIZJ();
                    } else {
                        str2 = null;
                    }
                    if (C78685UuP.LJJJZ(str2)) {
                        MediaUtil mediaUtil = MediaUtil.LIZ;
                        String LIZJ = nLESegmentAudio.LJ().LIZJ();
                        o.LJIIIIZZ(LIZJ, "it.avFile.resourceFile");
                        mediaUtil.getClass();
                        if (MediaUtil.LIZIZ(context2, LIZJ)) {
                            arrayList.add(nLESegmentAudio);
                        } else {
                            arrayList2.add(nLESegmentAudio);
                        }
                    }
                }
                Context context3 = this.LJLJLJ;
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) it5.next();
                    o.LJIIIIZZ(zipFolder, "zipFolder");
                    C5KN.LIZLLL(context3, nLESegmentVideo, zipFolder, true);
                }
                context = this.LJLJLJ;
                it = arrayList2.iterator();
            }
            return C76800UCe.LIZ;
        }
        while (it.hasNext()) {
            NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) it.next();
            o.LJIIIIZZ(zipFolder, "zipFolder");
            C84661XKn LIZLLL = C5KN.LIZLLL(context, nLESegmentVideo2, zipFolder, false);
            if (LIZLLL != null) {
                this.LJLIL = zipFolder;
                this.LJLILLLLZI = context;
                this.LJLJI = it;
                this.LJLJJI = 1;
                if (LIZLLL.LJJIJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
