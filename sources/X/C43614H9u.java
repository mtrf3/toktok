package X;

import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H9u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43614H9u extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC44718Hgo LJLIL;
    public final /* synthetic */ C44716Hgm LJLILLLLZI;
    public final /* synthetic */ C82622Wbi LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43614H9u(InterfaceC44718Hgo interfaceC44718Hgo, C44716Hgm c44716Hgm, C82622Wbi c82622Wbi, VideoPublishEditModel videoPublishEditModel, String str) {
        super(0);
        this.LJLIL = interfaceC44718Hgo;
        this.LJLILLLLZI = c44716Hgm;
        this.LJLJI = c82622Wbi;
        this.LJLJJI = videoPublishEditModel;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        float f;
        boolean z;
        OSZ osz;
        this.LJLIL.LJJJLL();
        C44716Hgm c44716Hgm = this.LJLILLLLZI;
        NLEModel nLEModel = c44716Hgm.LJII;
        if (nLEModel != null) {
            C82622Wbi c82622Wbi = this.LJLJI;
            VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
            String str = this.LJLJJL;
            AbstractC42651GoZ abstractC42651GoZ = (AbstractC42651GoZ) c82622Wbi.LJ(AbstractC42651GoZ.class, null);
            Bundle bundle = abstractC42651GoZ.mArguments;
            if (bundle != null) {
                if (c44716Hgm.LIZJ == EnumC43998HOo.CUT_SAME.getValue()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                bundle.putFloat("voice_volume", f);
                List LIZJ = C5V8.LIZJ(nLEModel);
                if (LIZJ != null && (!LIZJ.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InfoStickerModel infoStickerModel = new InfoStickerModel();
                    infoStickerModel.stickers = new ArrayList();
                    for (Object obj : LIZJ) {
                        StickerItemModel stickerItemModel = new StickerItemModel();
                        stickerItemModel.type = 2;
                        stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), obj);
                        infoStickerModel.stickers.add(stickerItemModel);
                    }
                    ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
                    Iterator it = LIZJ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C1XY.LIZIZ((TextStickerData) it.next(), ""));
                    }
                    videoPublishEditModel.creativeModel.autoCutModel.curRecommendTitleList = arrayList;
                    bundle.putParcelable("infosticker_model", infoStickerModel);
                }
                bundle.putInt("creation_mode", 1);
                bundle.putString("NLE", C45087Hml.LJJIL(nLEModel));
                int[] LIZLLL = C44739Hh9.LIZLLL();
                if (LIZLLL != null && LIZLLL.length == 2) {
                    osz = new OSZ(Integer.valueOf(LIZLLL[0]), Integer.valueOf(LIZLLL[1]));
                } else {
                    osz = new OSZ(1920, 1080);
                }
                VideoFileInfo videoFileInfo = new VideoFileInfo(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), nLEModel.getDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
                StringBuilder LIZ = X1D.LIZ();
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                LIZ.append(C45087Hml.LJIIIIZZ(creativeInfo));
                LIZ.append(C45087Hml.LJIJI());
                String LIZIZ = X1D.LIZIZ(LIZ);
                C78966Uyw.LJJJJZ(new File(LIZIZ));
                bundle.putParcelable("extra_edit_preview_info", new C149505tq(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    if (str != null) {
                        videoPublishEditModel.mWorkspace.LLILLL(str);
                        bundle.putParcelable("workspace", videoPublishEditModel.mWorkspace);
                    }
                    bundle.putString("path", videoPublishEditModel.getMMusicPath());
                    bundle.putSerializable("music_model", C78934UyQ.LJLIL.getMusicService().LJIILLIIL(extractAVMusic));
                    bundle.putString("music_origin", "auto_cut_music_recommend");
                    bundle.putBoolean("extra_need_add_recent", true);
                    bundle.putString("id", extractAVMusic.getMusicId());
                }
                C163816bp.LIZIZ(abstractC42651GoZ, bundle);
            }
        }
        return C76800UCe.LIZ;
    }
}
