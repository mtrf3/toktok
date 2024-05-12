package X;

import Y.AfS56S0200000_7;
import Y.IDuS2S1200000_7;
import Y.IDuS319S0100000_7;
import Y.IDuS78S0200000_7;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HIe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43832HIe implements IA5 {
    public final InterfaceC83624Wrs LJLIL;
    public final ShortVideoContextViewModel LJLILLLLZI;
    public long LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final WRQ LJLJJL;
    public final I9X LJLJJLL;
    public final ShortVideoContext LJLJL;
    public final H9R LJLJLJ;
    public final C82622Wbi LJLJLLL;
    public final List<InterfaceC43847HIt> LJLL = new ArrayList();

    @Override // X.IA5
    public final void LIZ(C46156I9o c46156I9o) {
        Boolean bool = (Boolean) this.LJLILLLLZI.LJLILLLLZI.getOrDefault("has_go_next", null);
        if (bool != null && bool.booleanValue()) {
            H78.LJI("VideoRecordActivity hasGoNext true return");
            return;
        }
        if (!this.LJLJL.cameraComponentModel.isRetakeMode) {
            long LIZIZ = C44529Hdl.LIZIZ();
            if (this.LJLJL.LJJIJIIJI()) {
                LIZIZ = 3000;
            }
            ShortVideoContext shortVideoContext = this.LJLJL;
            if (shortVideoContext.libraryContext.libraryMaterialCount == 0 ? shortVideoContext.LJIIIIZZ() < LIZIZ : shortVideoContext.LJIIIIZZ() - this.LJLJL.LJIIIZ() < LIZIZ) {
                if (!this.LJLJL.LJJJI() && !this.LJLJL.LJJIJIIJI()) {
                    C5S1 c5s1 = new C5S1(this.LJLJJI);
                    c5s1.LIZJ(R.string.to3);
                    c5s1.LJ();
                }
                if (this.LJLJL.LJJIJIIJI()) {
                    C5S1 c5s12 = new C5S1(this.LJLJJI);
                    c5s12.LIZJ(R.string.seo);
                    c5s12.LJ();
                }
                if (C43846HIs.LIZ(this.LJLJL)) {
                    C5S1 c5s13 = new C5S1(this.LJLJJI);
                    c5s13.LIZJ(R.string.to3);
                    c5s13.LJ();
                }
                this.LJLJJLL.LLLFZ(false);
                C43150Gwc.LIZIZ("record_error", "3", "is short");
                return;
            }
        }
        for (int i = 0; i < ((ArrayList) this.LJLL).size(); i++) {
            if (((InterfaceC43847HIt) ListProtector.get(this.LJLL, i)).LIZ(c46156I9o)) {
                H78.LJI("VideoRecordActivity interceptor handle return");
                this.LJLJJLL.LLLFZ(false);
                return;
            }
        }
        H78.LJI("VideoRecordActivity setHasGoNext true");
        this.LJLILLLLZI.hv0(true);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.start("av_video_edit", "showProgressDialog");
        this.LJLJI = System.currentTimeMillis();
        if (C43846HIs.LIZ(this.LJLJL)) {
            this.LJLIL.LLZL(this.LJLJL.cameraComponentModel.isMuted);
        }
        if (MusicBeanUtilKt.extractAVMusic(this.LJLJL.creativeModel.musicBuzModel) == null) {
            ShortVideoContext shortVideoContext2 = this.LJLJL;
            if (shortVideoContext2.mIsFromDraft && shortVideoContext2.creativeModel.musicBuzModel.isDraftMusicIllegal) {
                this.LJLIL.LLZL(true);
            }
        }
        c44298Ha2.step("av_video_edit", "startConcat");
        this.LJLJJL.e20().LIZIZ.getClass();
        C43870HJq c43870HJq = new C43870HJq();
        c43870HJq.LIZ = this.LJLJL.cameraComponentModel.mWorkspace.E().getPath();
        c43870HJq.LIZIZ = this.LJLJL.cameraComponentModel.mWorkspace.LJJJJLI().getPath();
        c43870HJq.LJ = this.LJLIL.getMediaController();
        c43870HJq.LIZLLL = this.LJLJL.enableSingleSegmentConcatUseCopy;
        c43870HJq.LJI = !r1.LJJIJIIJI();
        c43870HJq.LJII = VEMem.getInstance().inLowMemMode();
        c43870HJq.LJFF = C19N.LJ("pre_release_gpu_resource", false);
        c43870HJq.LIZJ = HMI.LIZ(this.LJLJL);
        c43870HJq.LIZ(new InterfaceC43874HJu() { // from class: X.HIh
            @Override // X.InterfaceC43874HJu
            public final void LIZ(int i2, String str, String str2, String str3) {
                AbstractC73672Svk LJJJ;
                C43832HIe c43832HIe = C43832HIe.this;
                c43832HIe.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MultiEditLog: concat statusCode");
                LIZ.append(i2);
                H7B.LIZ(X1D.LIZIZ(LIZ));
                G8G.LIZ.step("av_video_edit", "concatEnd");
                C43840HIm c43840HIm = new C43840HIm(str, str2, str3, i2);
                C43598H9e J0 = c43832HIe.LJLJJLL.J0();
                J0.LIZ = C43597H9d.L(J0.LIZ, System.currentTimeMillis(), 0L, null, 6);
                C73390SrC LJIIJ = AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(c43832HIe.LJLJL, 1));
                ShortVideoContext shortVideoContext3 = c43832HIe.LJLJL;
                if (shortVideoContext3.LJJIJIIJI()) {
                    LJJJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.HIp
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                            interfaceC73573Su9.onNext(AbstractC65743Pr9.absent());
                            interfaceC73573Su9.onComplete();
                        }
                    });
                } else {
                    LJJJ = AbstractC73672Svk.LJIIJ(new IDuS2S1200000_7(c43832HIe, shortVideoContext3, str3, 0)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                }
                AbstractC73672Svk.LJJLJLI(LJIIJ, LJJJ, AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(c43840HIm, c43832HIe, 0)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()), new InterfaceC89813fl() { // from class: X.HIq
                    @Override // X.InterfaceC89813fl
                    public final Object LIZJ(Object obj, Object obj2, Object obj3) {
                        return new C43842HIo((AbstractC65743Pr9) obj, (AbstractC65743Pr9) obj2, obj3);
                    }
                }).LJJJLIIL(new AfS56S0200000_7(c43832HIe, c43840HIm, 3), C171206nk.LJLIL);
            }
        });
    }

    @Override // X.IA5
    public final void LIZIZ(InterfaceC43847HIt interfaceC43847HIt) {
        ((ArrayList) this.LJLL).add(interfaceC43847HIt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0212, code lost:
    
        if (r4 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r14, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r15) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43832HIe.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[EDGE_INSN: B:40:0x0111->B:41:0x0111 BREAK  A[LOOP:0: B:22:0x0064->B:34:0x007e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43832HIe.LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData");
    }

    public static EditPreviewInfo LIZJ(ShortVideoContext shortVideoContext, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        EditPreviewInfo LIZ;
        if (multiEditVideoStatusRecordData != null && !shortVideoContext.LJJIJIIJI()) {
            LIZ = new C6NQ(shortVideoContext.cameraComponentModel.mVideoWidth, V16.LJJI(shortVideoContext), false, null, null, 252).LIZ(multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
        } else {
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, C78926UyI.LJJJLZIJ(str));
            o.LJIIIZ(shortVideoContext, "<this>");
            LIZ = new C149505tq(shortVideoContext.cameraComponentModel.mVideoWidth, V16.LJJI(shortVideoContext), 12).LIZ(editVideoSegment);
        }
        if (shortVideoContext.stitchContext.stitchParams != null) {
            for (File file : shortVideoContext.cameraComponentModel.mWorkspace.LJLIL.LLLZZIL()) {
                shortVideoContext.stitchContext.stitchParams.getRecordVideoPathLists().add(file.getPath());
            }
            for (File file2 : shortVideoContext.cameraComponentModel.mWorkspace.LJLIL.LJJJLL()) {
                shortVideoContext.stitchContext.stitchParams.getRecordVideoPathLists().add(file2.getPath());
            }
        }
        StitchParams stitchParams = shortVideoContext.stitchContext.stitchParams;
        if (stitchParams != null && stitchParams.getVideoSegment() != null) {
            ListProtector.add(LIZ.getVideoList(), 0, shortVideoContext.stitchContext.stitchParams.getVideoSegment());
            shortVideoContext.stitchContext.stitchParams.setConcatVideoPath(str);
            shortVideoContext.stitchContext.stitchParams.setConcatAudioPath(str2);
        }
        return LIZ;
    }

    public C43832HIe(ActivityC45651qj activityC45651qj, WRQ wrq, I9Z i9z, ShortVideoContext shortVideoContext, C82622Wbi c82622Wbi) {
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = wrq;
        this.LJLJJLL = i9z;
        this.LJLIL = wrq.e8();
        this.LJLJL = shortVideoContext;
        this.LJLJLLL = c82622Wbi;
        this.LJLJLJ = (H9R) c82622Wbi.LJ(H9R.class, null);
        this.LJLILLLLZI = (ShortVideoContextViewModel) ((ViewModelProvider) c82622Wbi.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
    }
}
