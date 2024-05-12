package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XXb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84987XXb extends XXG {
    public String LLILII;

    public final boolean Y() {
        MusicModel musicModel = this.LLFII;
        if (musicModel == null || musicModel.getMusic() == null || this.LLFII.getMusic().getMusicTags() == null || this.LLFII.getMusic().getMusicTags().size() <= 0 || !C78685UuP.LJJJZ(((MusicTag) ListProtector.get(this.LLFII.getMusicTags(), 0)).getTagTitle())) {
            return false;
        }
        return true;
    }

    public C84987XXb(View view, int i, boolean z, boolean z2) {
        super(view);
        this.LLIIIJ = z2;
        this.LLIIIILZ = z;
    }
}
