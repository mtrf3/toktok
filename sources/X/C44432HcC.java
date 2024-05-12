package X;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostFullChannel;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HcC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44432HcC implements InterfaceC48038ItG, InterfaceC46109I7t {
    public static boolean LJLIL = true;
    public static final C44432HcC LJLILLLLZI = new C44432HcC();
    public static boolean LJLJI;

    @Override // X.InterfaceC46109I7t
    public boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC46109I7t
    public boolean isEnabled() {
        return false;
    }

    public static final long LJFF() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    public static final EnumC75182Tf0 LJIIIIZZ() {
        EnumC75182Tf0 enumC75182Tf0 = EnumC75182Tf0.SINGLE_LIVE;
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            return EnumC75182Tf0.MULTI_GUEST;
        }
        if (C8E.LIZLLL().LLII() != EnumC75620Tm4.Linked) {
            return enumC75182Tf0;
        }
        return EnumC75182Tf0.COHOST;
    }

    public static final boolean LIZLLL() {
        boolean z;
        Boolean bool;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            z = LLIIJLIL2.LJIILIIL();
        } else {
            z = false;
        }
        boolean z2 = !z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canPreJoinChannel = ");
        LIZ.append(z2);
        LIZ.append(", isOneVnRtcTurnOn = ");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiCoHostService", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isRtcEngineOn = ");
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            bool = Boolean.valueOf(LLIIJLIL.LJIILIIL());
        } else {
            bool = null;
        }
        LIZ2.append(bool);
        C0NB.LJIIIZ("MultiCoHostService", X1D.LIZIZ(LIZ2));
        return z2;
    }

    public static final long LJI() {
        InterfaceC29405BgP LIZIZ;
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            return LIZIZ.getCurrentUserId();
        }
        return 0L;
    }

    public static final EnumC75674Tmw LJIIJ() {
        EnumC75674Tmw enumC75674Tmw;
        DataChannel dataChannel = B5G.LIZIZ().LIZIZ;
        if (dataChannel == null || (enumC75674Tmw = (EnumC75674Tmw) dataChannel.kv0(C29616Bjo.class)) == null) {
            return EnumC75674Tmw.NONE;
        }
        return enumC75674Tmw;
    }

    public static final long LJ(long j) {
        long j2 = j * 1000;
        C44435HcF LIZJ = SU4.LIZJ();
        if (j2 > LIZJ.LIZIZ) {
            return 1L;
        }
        long j3 = LIZJ.LIZ;
        if (j2 > j3) {
            return 1L;
        }
        return ((j3 - j2) / 86400000) + 2;
    }

    public static final long LJIIJJI(Room room) {
        RoomLinkInfo linkMicInfo;
        ChannelInfo channelInfo;
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (channelInfo = linkMicInfo.channelInfo) != null) {
            return channelInfo.groupChannelId;
        }
        return 0L;
    }

    public static final long LJIIL(Room room) {
        RoomLinkInfo linkMicInfo;
        ChannelInfo channelInfo;
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (channelInfo = linkMicInfo.channelInfo) != null) {
            return channelInfo.innerChannelId;
        }
        return 0L;
    }

    public static final long LJIILIIL(Room room) {
        MultiLiveUserSettings multiLiveUserSettings;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (arrayMap = multiLiveUserSettings.channelMap) == null || (l = arrayMap.get(2)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final EditPostPoiChangeType LJIILJJIL(EditPostModel editPostModel) {
        String str;
        if (editPostModel == null) {
            return EditPostPoiChangeType.UNKNOWN;
        }
        EditPostPoiChangeType editPostPoiChangeType = EditPostPoiChangeType.UNKNOWN;
        if (editPostModel.getOriginPoiData() == null && editPostModel.getPoiData() != null) {
            editPostPoiChangeType = EditPostPoiChangeType.ADD;
        }
        if (editPostModel.getOriginPoiData() != null && editPostModel.getPoiData() != null) {
            PoiData originPoiData = editPostModel.getOriginPoiData();
            String str2 = null;
            if (originPoiData != null) {
                str = originPoiData.getPoiId();
            } else {
                str = null;
            }
            PoiData poiData = editPostModel.getPoiData();
            if (poiData != null) {
                str2 = poiData.getPoiId();
            }
            if (!o.LJ(str, str2)) {
                editPostPoiChangeType = EditPostPoiChangeType.MODIFY;
            }
        }
        if (editPostModel.getOriginPoiData() != null && editPostModel.getPoiData() == null) {
            return EditPostPoiChangeType.DELETE;
        }
        return editPostPoiChangeType;
    }

    public static final C75768ToS LJIILL(User user) {
        String LJ = C05170If.LJ(user);
        String str = "";
        if (LJ == null) {
            LJ = "";
        }
        String LIZLLL = C05170If.LIZLLL(user);
        if (LIZLLL != null) {
            str = LIZLLL;
        }
        return new C75768ToS(LJ, str, user.getAvatarThumb());
    }

    public static final String LJIILLIIL(String aid) {
        o.LJIIIZ(aid, "aid");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJ(new CreativeInfo(aid, 0, null, 4, null), EnumC43650HBe.EDIT_POST_VIDEO, "editpost_local", true);
    }

    public static final boolean LJIJ(User user) {
        if (user.getFollowInfo().getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(MultiCoHostFullChannel.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }

    public static final void LIZ(int i, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void LIZIZ(View view, boolean z) {
        View findViewById = view.findViewById(R.id.j5i);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, C1549666i.LIZ(z) + layoutParams2.bottomMargin);
        findViewById.setLayoutParams(layoutParams2);
    }

    public static final void LIZJ(Context context, View view) {
        View findViewById = view.findViewById(R.id.ej6);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(R.dimen.a6d) + C81184Vtc.LJFF(context);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final void LJII(VideoPublishEditModel videoPublishEditModel, String videoPath) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z;
        o.LJIIIZ(videoPath, "videoPath");
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        videoPublishEditModel.creativeInfo = creativeInfo;
        videoPublishEditModel.uploadMethod = "download";
        videoPublishEditModel.mWorkspace = HU5.LIZ(creativeInfo);
        long j = 0;
        MediaModel mediaModel = new MediaModel(0L);
        mediaModel.fileLocalUriPath = videoPath;
        C173916s7 LIZIZ = C173926s8.LIZIZ(videoPath);
        mediaModel.duration = LIZIZ.LJ;
        mediaModel.width = LIZIZ.LIZJ;
        mediaModel.height = LIZIZ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoSegment(mediaModel));
        Workspace mWorkspace = videoPublishEditModel.mWorkspace;
        o.LJIIIIZZ(mWorkspace, "mWorkspace");
        ?? r6 = 1;
        videoPublishEditModel.setPreviewInfo(C6ZR.LIZ(true, mWorkspace, arrayList, new long[]{-1, -1}));
        videoPublishEditModel.mVideoCanvasHeight = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getHeight();
        videoPublishEditModel.mVideoCanvasWidth = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getWidth();
        if (((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
            if (videoCutInfo != null) {
                long end = videoCutInfo.getEnd();
                VideoCutInfo videoCutInfo2 = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    float start = (float) (end - videoCutInfo2.getStart());
                    VideoCutInfo videoCutInfo3 = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
                    if (videoCutInfo3 != null) {
                        videoPublishEditModel.setVideoLength((int) (start / videoCutInfo3.getSpeed()));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        videoPublishEditModel.getPreviewInfo().setPreviewVideoLength((int) mediaModel.duration);
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        o.LJIIIIZZ(previewInfo, "previewInfo");
        MultiEditVideoRecordData LJIIIZ = C46104I7o.LJIIIZ(previewInfo.getVideoList());
        if (LJIIIZ == null) {
            multiEditVideoStatusRecordData = null;
        } else {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j += ((VideoSegment) it.next()).duration;
            }
            long LIZ = HEL.LIZ();
            if (j > LIZ) {
                j = LIZ;
            }
            LJIIIZ.endTime = j;
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
        videoPublishEditModel.multiEditVideoRecordData = multiEditVideoStatusRecordData;
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.LLLLLLLLL().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.LLJJJIL().getPath();
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.LLLLLLLLLL().getPath();
        videoPublishEditModel.maxDuration = LivePlayEnforceIntervalSetting.DEFAULT;
        videoPublishEditModel.mHardEncode = 0;
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mOrigin = 0;
        videoPublishEditModel.stickerInfo = null;
        videoPublishEditModel.mRestoreType = 0;
        videoPublishEditModel.mUseFilter = 1;
        videoPublishEditModel.isPrivate = 0;
        videoPublishEditModel.md5 = "";
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            int i = videoSegment.width;
            int i2 = videoSegment.height;
            int LIZIZ2 = videoSegment.LIZIZ();
            int LIZLLL = videoSegment.LIZLLL();
            String LJII = videoSegment.LJII(r6);
            LJII.toString();
            long j2 = videoSegment.duration;
            long LJ = videoSegment.LJ() - videoSegment.LJIIIZ();
            String str = videoSegment.mDescription;
            String str2 = videoSegment.mMusicId;
            int LJI = videoSegment.LJI();
            float LJIIIIZZ = videoSegment.LJIIIIZZ();
            String LJII2 = videoSegment.LJII(false);
            LJII2.toString();
            arrayList2.add(new ImportVideoInfo(i, i2, LIZIZ2, LIZLLL, LJII, j2, LJ, str, str2, LJI, LJIIIIZZ, LJII2, videoSegment.originPath, videoSegment.fastImportDependHW, null, 16384, 0 == true ? 1 : 0));
            r6 = 1;
        }
        videoPublishEditModel.importInfoList = new ArrayList<>(arrayList2);
        videoPublishEditModel.videoCount = r6;
        videoPublishEditModel.isFastImport = r6;
        videoPublishEditModel.setVideoEditorType(6);
        if (videoPublishEditModel.getMainBusinessContext() == null) {
            videoPublishEditModel.setMainBusinessContext(new C164846dU());
        }
        videoPublishEditModel.musicVolume = 1.0f;
        videoPublishEditModel.voiceVolume = 1.0f;
        if (C44687HgJ.LIZIZ(videoPath)) {
            C140945g2 c140945g2 = new C140945g2(videoPublishEditModel);
            videoPublishEditModel.mOutVideoWidth = c140945g2.LIZIZ();
            videoPublishEditModel.mOutVideoHeight = c140945g2.LJ();
        }
    }

    public static final boolean LJIIZILJ(List list, List list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty() && ((ArrayList) list2).isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = (ArrayList) list2;
        if (arrayList.size() != arrayList2.size()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!arrayList2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void LJIJJ(java.util.Map map, List list, List list2, List list3) {
        int i;
        String str;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it.next();
            if (C78685UuP.LJJJZ(aVTextExtraStruct.hashTagName)) {
                Integer num = (Integer) ((LinkedHashMap) map).get(aVTextExtraStruct.hashTagName);
                String str2 = aVTextExtraStruct.hashTagName;
                o.LJI(str2);
                if (num != null) {
                    num.intValue();
                    i = num.intValue();
                } else {
                    i = 0;
                }
                map.put(str2, Integer.valueOf(i));
            } else if (C78685UuP.LJJJZ(aVTextExtraStruct.awemeId) && aVTextExtraStruct.type == 5) {
                String str3 = aVTextExtraStruct.awemeId;
                o.LJI(str3);
                ((ArrayList) list2).add(str3);
            } else if (aVTextExtraStruct.type == 0 && (str = aVTextExtraStruct.userId) != null) {
                ((ArrayList) list).add(str);
            }
        }
    }
}
