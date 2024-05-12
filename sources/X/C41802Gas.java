package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftPreviewConfigure;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfigKt;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gas, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41802Gas {
    public static final String LIZIZ(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        if (awemeDraft.LJIIIZ()) {
            if (awemeDraft.LJIIJ()) {
                return "story_photo";
            }
            return "multi_photo";
        }
        if (awemeDraft.LJJJJI.isPhotoMvMode) {
            return "slideshow";
        }
        if (!awemeDraft.LJIIL()) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
            if (aVDraftExtras.isStickPointMode || aVDraftExtras.editMusicSyncMode) {
                return "sound_sync";
            }
            if (aVDraftExtras.canvasVideoData != null) {
                return "photo_canvas";
            }
            if (aVDraftExtras.cutSameData == null) {
                if (awemeDraft.LJIIIIZZ()) {
                    return "autocut";
                }
                return "video";
            }
        }
        return "mv";
    }

    public static final EditPreviewInfo LIZJ(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        return LIZLLL(awemeDraft, true);
    }

    public static final List<EditVideoSegment> LJ(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        List list = aVDraftExtras.previewVideoListCopy;
        if (list != null) {
            return list;
        }
        List<DraftVideoSegment> list2 = aVDraftExtras.videoSegmentsCopy;
        if (list2 != null) {
            o.LJI(list2);
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                List<DraftVideoSegment> list3 = awemeDraft.LJJJJI.videoSegmentsCopy;
                if (list3 != null) {
                    Iterator<DraftVideoSegment> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C78926UyI.LJJJJJ(it.next()));
                    }
                }
                awemeDraft.LJJJJI.previewVideoListCopy = arrayList;
                return arrayList;
            }
            return null;
        }
        return null;
    }

    public static final boolean LJFF(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        if (aVDraftExtras.publishStage == 50) {
            return false;
        }
        ShoutOutsData shoutOutsData = aVDraftExtras.shoutOutsData;
        if (shoutOutsData != null && o.LJ(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_POST)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(AwemeDraft awemeDraft) {
        if (System.currentTimeMillis() - awemeDraft.saveTime <= 86400000) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(AwemeDraft awemeDraft) {
        NowsExtra nowsExtra;
        o.LJIIIZ(awemeDraft, "<this>");
        NowsShootModel nowsShootModel = awemeDraft.LIZ.nowsShootModel;
        if (nowsShootModel == null || (nowsExtra = nowsShootModel.nowsExtra) == null || !nowsExtra.isNowPublish) {
            return false;
        }
        return true;
    }

    public static final Bitmap LIZ(VideoCoverConfig videoCoverConfig, String str) {
        if (VideoCoverConfigKt.isValid(videoCoverConfig) && str != null) {
            return C38891fp.LJIILIIL(videoCoverConfig.displayWidth, videoCoverConfig.displayHeight, str);
        }
        return BitmapFactory.decodeFile(str);
    }

    public static final EditPreviewInfo LIZLLL(AwemeDraft awemeDraft, boolean z) {
        VideoFileInfo videoFileInfo;
        int i;
        int i2;
        o.LJIIIZ(awemeDraft, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[getPreviewInfo]: creation id = ");
        LIZ.append(awemeDraft.LIZ());
        LIZ.append(" is fast import = ");
        LIZ.append(awemeDraft.LJJJJI.isFastImport);
        C143195jf.LIZ(X1D.LIZIZ(LIZ));
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        EditPreviewInfo editPreviewInfo = aVDraftExtras.previewInfo;
        if (editPreviewInfo != null) {
            if (editPreviewInfo.getPreviewWidth() <= 0 && (i2 = awemeDraft.LJJJJI.videoOutWidth) > 0) {
                editPreviewInfo.setPreviewWidth(i2);
            }
            if (editPreviewInfo.getPreviewHeight() <= 0 && (i = awemeDraft.LJJJJI.videoOutHeight) > 0) {
                editPreviewInfo.setPreviewHeight(i);
            }
            if (awemeDraft.LJIILL == 1) {
                AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJI;
                if (!aVDraftExtras2.fileLengthFixed) {
                    aVDraftExtras2.fileLengthFixed = true;
                    List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
                    int i3 = 0;
                    for (EditVideoSegment editVideoSegment : videoList) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            EditVideoSegment editVideoSegment2 = editVideoSegment;
                            long duration = editVideoSegment2.getVideoFileInfo().getDuration();
                            long j = duration / 1000;
                            ListProtector.set(videoList, i3, EditVideoSegment.copy$default(editVideoSegment2, null, null, VideoFileInfo.copy$default(editVideoSegment2.getVideoFileInfo(), 0, 0, j, 0, 0, 0, 0, 0, 0.0f, 507, null), null, 11, null));
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("[getPreviewInfo]:fix video length in draft,old:");
                            LIZ2.append(duration);
                            LIZ2.append(",new:");
                            LIZ2.append(j);
                            C143195jf.LIZ(X1D.LIZIZ(LIZ2));
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("[getPreviewInfo]:videoPath = ");
                            LIZ3.append(editVideoSegment2.getVideoPath());
                            LIZ3.append(", audioPath = ");
                            LIZ3.append(editVideoSegment2.getAudioPath());
                            C143195jf.LIZ(X1D.LIZIZ(LIZ3));
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
            List<EditVideoSegment> LJ = LJ(awemeDraft);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[getPreviewInfo]: previewVideoListCopy = ");
            LIZ4.append(LJ);
            C143195jf.LIZ(X1D.LIZIZ(LIZ4));
            if (LJ != null && !LJ.isEmpty()) {
                if (LJ.size() < editPreviewInfo.getVideoList().size()) {
                    C143195jf.LIZ("[getPreviewInfo]: copySize < previewInfo!!.videoList.size");
                    return editPreviewInfo;
                }
                int size = editPreviewInfo.getVideoList().size();
                for (int i5 = 0; i5 < size; i5++) {
                    EditVideoSegment editVideoSegment3 = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i5);
                    boolean LIZIZ = C44687HgJ.LIZIZ(editVideoSegment3.getVideoPath());
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("[getPreviewInfo]: videoPath = ");
                    LIZ5.append(editVideoSegment3.getVideoPath());
                    LIZ5.append(" is exist = ");
                    LIZ5.append(LIZIZ);
                    C143195jf.LIZ(X1D.LIZIZ(LIZ5));
                    if (!LIZIZ) {
                        ListProtector.set(editPreviewInfo.getVideoList(), i5, ListProtector.get(LJ, i5));
                    }
                }
            }
            awemeDraft.LJJJJI.previewInfo = editPreviewInfo;
            return editPreviewInfo;
        }
        EditPreviewInfo editPreviewInfo2 = null;
        DraftPreviewConfigure draftPreviewConfigure = aVDraftExtras.previewConfigure;
        if (draftPreviewConfigure != null) {
            List<DraftVideoSegment> list = aVDraftExtras.videoSegmentsCopy;
            if (list != null && !list.isEmpty() && !C44687HgJ.LIZIZ(((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).videoPath)) {
                List<DraftVideoSegment> list2 = awemeDraft.LJJJJI.videoSegmentsCopy;
                if (list2 == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                o.LJIIIZ(list2, "<set-?>");
                draftPreviewConfigure.videoSegments = list2;
                C143195jf.LIZ("draftOpt==>getDraftPreviewConfigure,using copy video videoSegment");
            }
            editPreviewInfo2 = new C149505tq(draftPreviewConfigure.previewWidth, draftPreviewConfigure.previewHeight, 12).LIZ(C78926UyI.LJJJJJ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)));
            String str = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).reversePath;
            if (str != null) {
                editPreviewInfo2.setReverseVideoArray(new String[]{str});
            }
            String str2 = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).audioPath;
            if (str2 != null && ujb.o.LJJJJ(str2, "reverse.wav", false)) {
                editPreviewInfo2.setReverseAudioArray(new String[]{str2});
            }
            String str3 = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).tempVideoPath;
            if (str3 != null) {
                editPreviewInfo2.setTempVideoArray(new String[]{str3});
            }
        } else if (awemeDraft.LJFF != null) {
            String str4 = awemeDraft.LJFF;
            o.LJI(str4);
            String str5 = awemeDraft.LJII;
            if (z) {
                videoFileInfo = C78926UyI.LJJJLZIJ(awemeDraft.LJFF);
            } else {
                videoFileInfo = new VideoFileInfo(0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null);
            }
            editPreviewInfo2 = new C149505tq(0, 0, 15).LIZ(new EditVideoSegment(str4, str5, videoFileInfo));
            if (!TextUtils.isEmpty(awemeDraft.LJIILLIIL)) {
                String str6 = awemeDraft.LJIILLIIL;
                o.LJI(str6);
                editPreviewInfo2.setReverseVideoArray(new String[]{str6});
            }
        }
        awemeDraft.LJJJJI.previewInfo = editPreviewInfo2;
        return editPreviewInfo2;
    }

    public static final void LJIIIZ(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        FilterBean filter;
        String filterFolder;
        float LJFF;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(awemeDraft.LJ());
        boolean equals = TextUtils.equals(String.valueOf(awemeDraft.LJIILJJIL), "1");
        IEffectService effectService = AVServiceImpl.LIZ().effectService();
        if (effectService != null) {
            IFilterService filterService = AVServiceImpl.LIZ().getFilterService();
            if (filterService != null && (filter = filterService.getFilter(awemeDraft.LJIIL)) != null && (filterFolder = filter.getFilterFolder()) != null) {
                if (awemeDraft.LJFF() == -1.0f) {
                    LJFF = 0.8f;
                } else {
                    LJFF = awemeDraft.LJFF();
                }
                effectService.getVideoCoverByCallback(arrayList, filterFolder, LJFF, (int) (awemeDraft.LJJIJLIJ * ((float) 1000)), equals, LIZJ(awemeDraft), new C41804Gau(awemeDraft, onVideoCoverCallback));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void LJIIJ(int i, AwemeDraft awemeDraft) {
        String str;
        FilterBean filter;
        awemeDraft.LJIIL = i;
        IFilterService filterService = AVServiceImpl.LIZ().getFilterService();
        if (filterService != null && (filter = filterService.getFilter(i)) != null) {
            str = filter.getFilterFolder();
        } else {
            str = null;
        }
        awemeDraft.LJJJJI.filterLocalPath = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r6, com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig r7, com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback r8) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41802Gas.LJIIIIZZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback):void");
    }
}
