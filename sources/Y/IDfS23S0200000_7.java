package Y;

import X.ActivityC45651qj;
import X.C149505tq;
import X.C41408GMy;
import X.C41700GYe;
import X.C41701GYf;
import X.C41702GYg;
import X.C41703GYh;
import X.C43073GvN;
import X.C43075GvP;
import X.C45804HyK;
import X.C46104I7o;
import X.C47261Igj;
import X.C62850Ola;
import X.C76800UCe;
import X.C77412UZs;
import X.C78926UyI;
import X.C78966Uyw;
import X.EnumC43649HBd;
import X.HEL;
import X.HU5;
import X.HZV;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.OSZ;
import X.ProgressDialogC43239Gy3;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class IDfS23S0200000_7 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Object obj, InterfaceC67352kd interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC67352kd);
            case 1:
                return emit$1(this, obj, interfaceC67352kd);
            case 2:
                return emit$2(this, obj, interfaceC67352kd);
            case 3:
                return emit$3(this, obj, interfaceC67352kd);
            case 4:
                return emit$4(this, obj, interfaceC67352kd);
            case 5:
                return emit$5(this, obj, interfaceC67352kd);
            case 6:
                return emit$6(this, obj, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS23S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.IDfS23S0200000_7 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C41919Gcl
            if (r0 == 0) goto L52
            r7 = r10
            X.Gcl r7 = (X.C41919Gcl) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L27
            if (r0 != r5) goto L58
            X.2mC r4 = r7.LJLJI
            X.C141335gf.LIZJ(r1)
        L22:
            r4.element = r1
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r4 = r8.l0
            X.2mC r4 = (X.C68322mC) r4
            T r3 = r4.element
            java.lang.String r9 = (java.lang.String) r9
            java.util.zip.ZipOutputStream r3 = (java.util.zip.ZipOutputStream) r3
            int r0 = r9.length()
            if (r0 <= 0) goto L4d
            X.XIC r2 = X.C78613UtF.LIZ
            X.FRn r1 = new X.FRn
            r0 = 0
            r1.<init>(r3, r9, r0)
            r7.LJLJI = r4
            r7.LJLILLLLZI = r5
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r7)
            if (r1 != r6) goto L22
            return r6
        L4d:
            java.lang.Object r1 = r8.l1
            java.util.zip.ZipOutputStream r1 = (java.util.zip.ZipOutputStream) r1
            goto L22
        L52:
            X.Gcl r7 = new X.Gcl
            r7.<init>(r8, r10)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS23S0200000_7.emit$0(Y.IDfS23S0200000_7, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS23S0200000_7 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C41918Gck
            if (r0 == 0) goto La3
            r5 = r10
            X.Gck r5 = (X.C41918Gck) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 != r6) goto Laa
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r3 = r8.l0
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            X.OSZ r9 = (X.OSZ) r9
            java.lang.Object r10 = r8.l1
            X.Gcd r10 = (X.C41911Gcd) r10
            java.lang.Object r7 = r9.getFirst()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r0 = r9.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            r10.getClass()
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = X.C41920Gcm.LIZ()
            if (r0 == 0) goto La0
            java.lang.String r2 = ".webp"
        L50:
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r10.LIZLLL()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.<init>(r0)
            java.lang.String r2 = r10.LIZLLL()
            java.lang.String r1 = r8.getName()
            java.lang.String r0 = "file.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = X.C41920Gcm.LIZ()
            boolean r0 = X.C86793Y4n.LJJIJL(r7, r2, r1, r0)
            if (r0 == 0) goto L95
            boolean r0 = r7.isRecycled()
            if (r0 != 0) goto L8f
            r7.recycle()
        L8f:
            java.lang.String r0 = r8.getAbsolutePath()
            if (r0 != 0) goto L97
        L95:
            java.lang.String r0 = ""
        L97:
            r5.LJLILLLLZI = r6
            java.lang.Object r0 = r3.emit(r0, r5)
            if (r0 != r4) goto L20
            return r4
        La0:
            java.lang.String r2 = ".jpg"
            goto L50
        La3:
            X.Gck r5 = new X.Gck
            r5.<init>(r8, r10)
            goto L12
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS23S0200000_7.emit$1(Y.IDfS23S0200000_7, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$2(IDfS23S0200000_7 iDfS23S0200000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C41703GYh c41703GYh = (C41703GYh) obj;
        Context context = (Context) iDfS23S0200000_7.l0;
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = (ProgressDialogC43239Gy3) iDfS23S0200000_7.l1;
        Bundle bundle = new Bundle();
        C77412UZs.LJJIJLIJ(bundle, c41703GYh.LIZ);
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.challengeName = context.getString(R.string.p3);
        AVExternalServiceImpl.LIZ().publishService().addAVChallenges(C47261Igj.LJJIJ(aVChallenge));
        bundle.putSerializable("on_this_day_day", new OnThisDayData(true, 0, 1, c41703GYh.LIZIZ.getPastMemoryKey(), c41703GYh.LIZIZ.getCreateTime(), null, false, 96, null));
        bundle.putParcelable("workspace", HU5.LIZ(c41703GYh.LIZ));
        bundle.putInt("origin", 0);
        bundle.putString("content_type", "share");
        bundle.putString("content_source", "upload");
        bundle.putLong("extra_start_enter_edit_page", System.currentTimeMillis());
        bundle.putString("shoot_way", "on_this_day");
        IOpenPhotoNextService openGotoNextService = AVExternalServiceImpl.LIZ().openGotoNextService();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            openGotoNextService.gotoNextPage(LJJIFFI, false, bundle, c41703GYh.LJ, new C41408GMy(progressDialogC43239Gy3));
            C41700GYe.LIZLLL((ProgressDialogC43239Gy3) iDfS23S0200000_7.l1, false);
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object emit$3(IDfS23S0200000_7 iDfS23S0200000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        OSZ osz = (OSZ) obj;
        C41700GYe.LIZIZ((Context) iDfS23S0200000_7.l0, (C41702GYg) osz.getFirst(), (CanvasVideoData) osz.getSecond(), false);
        C41700GYe.LIZLLL((ProgressDialogC43239Gy3) iDfS23S0200000_7.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS23S0200000_7 iDfS23S0200000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        OSZ osz = (OSZ) obj;
        C41700GYe.LIZIZ((Context) iDfS23S0200000_7.l0, (C41702GYg) osz.getFirst(), (CanvasVideoData) osz.getSecond(), true);
        C41700GYe.LIZLLL((ProgressDialogC43239Gy3) iDfS23S0200000_7.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS23S0200000_7 iDfS23S0200000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        OSZ osz = (OSZ) obj;
        Context context = (Context) iDfS23S0200000_7.l0;
        C41702GYg c41702GYg = (C41702GYg) osz.getFirst();
        CanvasVideoData canvasVideoData = (CanvasVideoData) osz.getSecond();
        Intent intent = new Intent();
        C77412UZs.LJJIJIL(intent, c41702GYg.LIZ);
        ForwardMedia forwardMedia = c41702GYg.LIZIZ;
        CreativeInfo creativeInfo = c41702GYg.LIZ;
        OSZ<Integer, Integer> osz2 = c41702GYg.LJFF;
        VideoFileInfo videoFileInfo = new VideoFileInfo(forwardMedia.getVideo().getSourceWidth(), forwardMedia.getVideo().getSourceHeight(), forwardMedia.getVideo().getSourceDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.CONCAT, null, false, 12));
        LIZ.append(C43075GvP.LIZ(".mp4"));
        String LIZIZ = X1D.LIZIZ(LIZ);
        C78966Uyw.LJJJJZ(new File(LIZIZ));
        intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(osz2.getFirst().intValue(), osz2.getSecond().intValue(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
        C41700GYe.LIZ(intent, context, 2, c41702GYg.LIZIZ, c41702GYg.LIZ);
        intent.putExtra("photo_canvas_data", canvasVideoData);
        HZV.LIZ().LJJII(context, intent);
        C41700GYe.LIZLLL((ProgressDialogC43239Gy3) iDfS23S0200000_7.l1, true);
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS23S0200000_7 iDfS23S0200000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z;
        C41701GYf c41701GYf = (C41701GYf) obj;
        Context context = (Context) iDfS23S0200000_7.l0;
        Intent intent = new Intent();
        C77412UZs.LJJIJIL(intent, c41701GYf.LIZ);
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.challengeName = context.getString(R.string.p3);
        intent.putExtra("challenge", (Serializable) C47261Igj.LJJIJ(aVChallenge));
        OSZ<Integer, Integer> osz = c41701GYf.LIZLLL;
        String str = c41701GYf.LJ;
        VideoFileInfo LJJJLZIJ = C78926UyI.LJJJLZIJ(str);
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = null;
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, LJJJLZIJ);
        EditPreviewInfo LIZ = new C149505tq(osz.getFirst().intValue(), osz.getSecond().intValue(), 12).LIZ(new EditVideoSegment(str, null, LJJJLZIJ));
        List LJJIJ = C47261Igj.LJJIJ(editVideoSegment);
        MultiEditVideoRecordData LJIIIZ = C46104I7o.LJIIIZ(LIZ.getVideoList());
        if (LJIIIZ == null) {
            multiEditVideoStatusRecordData = null;
        } else {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it = LJJIJ.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((EditVideoSegment) it.next()).getVideoFileInfo().getDuration();
            }
            LJIIIZ.endTime = Math.min(j, HEL.LIZ());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (LJIIIZ.segmentDataList.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                LJIIIZ.isSingleVideo = z;
                multiEditVideoStatusRecordData.originMultiEditRecordData = LJIIIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = LJIIIZ;
        }
        ArrayList<? extends Parcelable> LJFF = C41700GYe.LJFF(str);
        if (multiEditVideoStatusRecordData instanceof Parcelable) {
            multiEditVideoStatusRecordData2 = multiEditVideoStatusRecordData;
        }
        intent.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData2);
        intent.putExtra("extra_edit_preview_info", (Parcelable) LIZ);
        intent.putParcelableArrayListExtra("extra_import_video_info_list", LJFF);
        C41700GYe.LIZ(intent, context, 0, c41701GYf.LIZIZ, c41701GYf.LIZ);
        intent.putExtra("extra_av_is_fast_import", true);
        HZV.LIZ().LJJII(context, intent);
        C41700GYe.LIZLLL((ProgressDialogC43239Gy3) iDfS23S0200000_7.l1, true);
        return C76800UCe.LIZ;
    }
}
