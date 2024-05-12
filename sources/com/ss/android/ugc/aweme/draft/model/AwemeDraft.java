package com.ss.android.ugc.aweme.draft.model;

import X.C63A;
import X.GWC;
import X.H76;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import defpackage.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AwemeDraft {
    public CreativeModel LIZ;
    public String LIZJ;
    public AVMusic LIZLLL;
    public String LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public UrlModel LJIJ;
    public String LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public long LJJ;
    public int LJJI;
    public EffectListModel LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIL;
    public int LJJIJL;
    public float LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public boolean LJJJ;
    public long LJJJI;
    public String LJJJIL;
    public boolean LJJJJ;
    public AVDraftExtras LJJJJI;

    @InterfaceC65349Pkn("aweme")
    public AVDraftAwemeCompat aweme;

    @InterfaceC65349Pkn("id")
    public int id;

    @InterfaceC65349Pkn("time")
    public long lastEditTime;

    @InterfaceC65349Pkn("photoMovieContext")
    public PhotoMovieContext photoMovieContext;

    @InterfaceC65349Pkn("save_time")
    public long saveTime;
    public transient int LIZIZ = -1;
    public boolean LJ = true;
    public final transient HashMap<String, String> LJIJI = new HashMap<>();
    public final float[] LJJIJIIJIL = new float[0];

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeDraft() {
        int i = -1;
        this.LIZ = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 31, 0 == true ? 1 : 0);
        float f = 0.0f;
        long j = 0;
        int i2 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        Object[] objArr86 = 0 == true ? 1 : 0;
        Object[] objArr87 = 0 == true ? 1 : 0;
        Object[] objArr88 = 0 == true ? 1 : 0;
        Object[] objArr89 = 0 == true ? 1 : 0;
        Object[] objArr90 = 0 == true ? 1 : 0;
        Object[] objArr91 = 0 == true ? 1 : 0;
        Object[] objArr92 = 0 == true ? 1 : 0;
        Object[] objArr93 = 0 == true ? 1 : 0;
        Object[] objArr94 = 0 == true ? 1 : 0;
        Object[] objArr95 = 0 == true ? 1 : 0;
        Object[] objArr96 = 0 == true ? 1 : 0;
        Object[] objArr97 = 0 == true ? 1 : 0;
        Object[] objArr98 = 0 == true ? 1 : 0;
        Object[] objArr99 = 0 == true ? 1 : 0;
        Object[] objArr100 = 0 == true ? 1 : 0;
        this.LJJJJI = new AVDraftExtras(0, 0 == true ? 1 : 0, null, objArr, objArr2, 0 == true ? 1 : 0, objArr3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, objArr5, 0 == true ? 1 : 0, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, 0 == true ? 1 : 0, objArr25, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr26, objArr27, objArr28, 0 == true ? 1 : 0, objArr29, objArr30, objArr31, objArr32, objArr33, 0 == true ? 1 : 0, objArr34, objArr35, objArr36, objArr37, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr38, objArr39, objArr40, objArr41, 0 == true ? 1 : 0, objArr42, objArr43, objArr44, objArr45, objArr46, 0 == true ? 1 : 0, objArr47, objArr48, objArr49, objArr50, objArr51, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, objArr52, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr59, 0 == true ? 1 : 0, objArr60, 0 == true ? 1 : 0, objArr61, objArr62, objArr63, objArr64, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, 0 == true ? 1 : 0, objArr71, objArr72, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, f, objArr73, objArr74, objArr75, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, j, objArr85, objArr86, objArr87, objArr88, objArr89, objArr90, objArr91, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr92, 0 == true ? 1 : 0, objArr93, objArr94, 0 == true ? 1 : 0, objArr95, objArr96, objArr97, j, objArr98, 0 == true ? 1 : 0, objArr99, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2, i2, i2, i2, 536870911, objArr100);
    }

    public final CreativeInfo LIZIZ() {
        AVDraftExtras aVDraftExtras = this.LJJJJI;
        if (aVDraftExtras.creativeInfo == null) {
            aVDraftExtras.creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        }
        CreativeInfo creativeInfo = this.LJJJJI.creativeInfo;
        o.LJI(creativeInfo);
        return creativeInfo;
    }

    public final String LIZJ() {
        if (TextUtils.isEmpty(this.LIZJ)) {
            this.LIZJ = LIZ();
        }
        return this.LIZJ;
    }

    public final DraftVEAudioEffectParam LIZLLL() {
        AVDraftExtras aVDraftExtras = this.LJJJJI;
        if (aVDraftExtras != null) {
            return aVDraftExtras.draftVEAudioEffectParam;
        }
        return null;
    }

    public final List<EffectPointModel> LJ() {
        return this.LIZ.editEffectModel.effectList;
    }

    public final float LJFF() {
        double d = this.LJJJJI.filterIntensity;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return -1.0f;
        }
        return this.LJJJJI.filterIntensity;
    }

    public final InfoStickerModel LJI() {
        AVDraftExtras aVDraftExtras = this.LJJJJI;
        if (aVDraftExtras != null) {
            return aVDraftExtras.infoStickerModel;
        }
        return null;
    }

    public final String LJII() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData == null) {
            return null;
        }
        o.LJI(multiEditVideoStatusRecordData);
        return multiEditVideoStatusRecordData.coverImagePath;
    }

    public final boolean LJIIIIZZ() {
        int i;
        AutoCutModel autoCutModel = this.LIZ.autoCutModel;
        if (autoCutModel.curIndexFromSource >= 0 && (i = autoCutModel.curSource) >= 0 && i < C63A.values().length) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        AVDraftExtras aVDraftExtras = this.LJJJJI;
        if (aVDraftExtras.imageAlbumData != null && aVDraftExtras.creationMode == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        if (this.LJJJJI.lighteningExtraInfo != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null) {
            o.LJI(multiEditVideoStatusRecordData);
            if (multiEditVideoStatusRecordData.isSupportMultiEdit) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIL() {
        if (this.LJJJJI.mvCreateVideoData != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String LIZIZ;
        StringBuilder sb = new StringBuilder("AwemeDraft{id=");
        sb.append(this.id);
        sb.append("creationId=");
        sb.append(LIZ());
        sb.append("previewInfo=");
        EditPreviewInfo editPreviewInfo = this.LJJJJI.previewInfo;
        if (editPreviewInfo == null) {
            LIZIZ = null;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(editPreviewInfo.getVideoList().size());
            LIZ.append("][videoFileInfo:");
            LIZ.append(ORZ.LLD(editPreviewInfo.getVideoList(), null, null, null, GWC.LJLIL, 31));
            LIZ.append("][videoCutInfo:");
            LIZIZ = q.LIZIZ(LIZ, ORZ.LLD(editPreviewInfo.getVideoList(), null, null, null, H76.LJLIL, 31), ']', LIZ);
        }
        sb.append(LIZIZ);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(", photoMovieContext=");
        sb.append(this.photoMovieContext);
        sb.append(", musicModel=");
        sb.append(this.LIZLLL);
        sb.append(", videoPath='");
        sb.append(this.LJFF);
        sb.append("', musicPath='");
        sb.append(this.LJI);
        sb.append("', voicePath='");
        sb.append(this.LJII);
        sb.append("', videoVolume=");
        sb.append(this.LJIIIIZZ);
        sb.append(", musicVolume=");
        sb.append(this.LJIIIZ);
        sb.append(", filter=");
        sb.append(this.LJIIL);
        sb.append(", musicStart=");
        sb.append(this.LJIILIIL);
        sb.append(", effect=");
        sb.append(this.LJIILJJIL);
        sb.append(", origin=");
        sb.append(this.LJIILL);
        sb.append(", mReversePath='");
        sb.append(this.LJIILLIIL);
        sb.append("', videoSpeed='");
        sb.append(this.LJIIZILJ);
        sb.append("', audioTrack=");
        sb.append(this.LJIJ);
        sb.append(", fiterLabel='");
        sb.append(this.LJIJJ);
        sb.append("', cameraPos=");
        sb.append(this.LJIJJLI);
        sb.append(", useBeauty=");
        sb.append(this.LJIL);
        sb.append(", type=0, isWidthDivider=false, privateVideo=");
        sb.append(this.LJJI);
        sb.append(", mEffectListModel=");
        sb.append(this.LJJIFFI);
        sb.append(", maxDuration=");
        sb.append(this.LJJII);
        sb.append(", faceBeauty=");
        sb.append(this.LJJIII);
        sb.append(", userId='");
        sb.append(this.LJJIIJ);
        sb.append("', time=");
        sb.append(this.lastEditTime);
        sb.append(", videoSegmentsDesc='");
        sb.append(this.LJJIIJZLJL);
        sb.append("', hardEncode=");
        sb.append(this.LJJIIZ);
        sb.append(", specialPoints=");
        sb.append(this.LJJIIZI);
        sb.append(", stickerPath='");
        sb.append(this.LJJIJ);
        sb.append("', stickerID='");
        sb.append(this.LJJIJIIJI);
        sb.append("', volumeTaps=");
        String arrays = Arrays.toString(this.LJJIJIIJIL);
        o.LJIIIIZZ(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", musicEffectSegments='");
        sb.append(this.LJJIJIL);
        sb.append("', newVersion=");
        sb.append(this.LJJIJL);
        sb.append(", customCoverStart=");
        sb.append(this.LJJIJLIJ);
        sb.append(", duetFrom='");
        sb.append(this.LJJIL);
        sb.append("', syncPlatforms='");
        sb.append(this.LJJIZ);
        sb.append("', from='0', extras=");
        sb.append(this.LJJJJI);
        sb.append('}');
        return sb.toString();
    }

    public final String LIZ() {
        return LIZIZ().getCreationId();
    }

    public final void LJIILIIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LJJJJI.creationId = creativeInfo.getCreationId();
        this.LJJJJI.creativeInfo = creativeInfo;
    }
}
