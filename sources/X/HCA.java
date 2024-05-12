package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class HCA extends ArrayList<TimeSpeedModelExtension> {
    public transient EnumC82528WaC LJLIL;
    public transient FaceStickerBean LJLILLLLZI;
    public transient List<AVChallenge> LJLJI;
    public transient int LJLJJI;
    public BeautyMetadata LJLJJL;
    public String LJLJJLL;
    public transient int LJLJL;
    public transient int LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public transient Bundle LJLLL;
    public String segmentBeginTime;

    public HCA() {
        this.LJLJJI = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1.0f;
    }

    public void removeLast() {
        remove(size() - 1);
    }

    public HCA(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
        this.LJLJJI = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1.0f;
    }

    public long end(long j, Bundle bundle) {
        return end(j, null, null, null, null, null, null, null, null, bundle);
    }

    public void begin(EnumC82528WaC enumC82528WaC, Bundle bundle, Bundle bundle2) {
        this.LJLIL = enumC82528WaC;
        this.LJLILLLLZI = (FaceStickerBean) bundle.getParcelable("currentSticker");
        this.LJLL = bundle.getBoolean("is_uploadtype_sticker");
        this.LJLLI = bundle.getInt("upload_type_sticker_media_size");
        this.LJLLILLLL = bundle.getBoolean("is_texttype_sticker");
        this.LJLJI = bundle.getParcelableArrayList("currentChallenge");
        this.LJLJJI = bundle.getInt("cameraId", -1);
        this.LJLJJL = (BeautyMetadata) bundle.getSerializable("beautyMetadata");
        this.LJLJJLL = bundle.getString("cameraLensInfo");
        this.segmentBeginTime = String.valueOf(SystemClock.elapsedRealtime());
        boolean z = false;
        if (bundle.getInt("is_use_mirror_mode", 0) == 1) {
            z = true;
        }
        this.LJLLJ = z;
        this.LJLJL = bundle.getInt("tabOrder", -1);
        this.LJLJLJ = bundle.getInt("imprPosition", -1);
        this.LJLJLLL = bundle.getFloat("effect_intensity", -1.0f);
        this.LJLLL = bundle2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x006c, code lost:
    
        if (r16 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long end(long r55, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo r57, java.util.List<java.lang.String> r58, java.util.List<java.lang.String> r59, X.HCC r60, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo r61, com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r62, com.ss.android.ugc.aweme.sticker.model.DiyPropVideo r63, java.lang.String r64, android.os.Bundle r65) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCA.end(long, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo, java.util.List, java.util.List, X.HCC, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo, com.ss.android.ugc.aweme.sticker.model.BackgroundVideo, com.ss.android.ugc.aweme.sticker.model.DiyPropVideo, java.lang.String, android.os.Bundle):long");
    }
}
