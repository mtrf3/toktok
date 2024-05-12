package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;

/* renamed from: X.JyY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50914JyY extends JHL<C50914JyY> {
    public String LJJL;
    public String LJJLI;
    public long LJJLIIIIJ;
    public final String LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public double LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public boolean LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public int LJLIIIL;
    public boolean LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public final int LJLZ;
    public int LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public int LLF;
    public String LLFF;
    public int LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public boolean LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public int LLIIIL;
    public String LLIIIZ;
    public int LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public String LLIIZ;
    public String LLIL;
    public int LLILII;
    public String LLILIL;
    public int LLILL;
    public Long LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Integer LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public int LLJJIJI;

    public C50914JyY() {
        super("play_time");
        this.LJJLIIIJ = "";
        this.LJJLIIIJILLIZJL = 1;
        this.LJLIIIL = -1;
        this.LJLZ = -1;
        this.LLFII = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = "";
        this.LLIIIL = -1;
        this.LLIIIZ = "";
        this.LLIIJLIL = "";
        this.LLIIL = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = "";
        this.LLILIL = "";
        this.LLILLIZIL = 0L;
        this.LLILZIL = 0;
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJ = -1;
        this.LLJJIJI = 0;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0871 A[LOOP:2: B:323:0x086b->B:325:0x0871, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08af  */
    @Override // X.JHM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instructions count: 2476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50914JyY.LJII():void");
    }

    @Override // X.JHL
    public final String LJIJJ() {
        return this.LJJL;
    }

    @Override // X.JHM
    public final void LJIIIIZZ(Aweme aweme) {
        super.LJIIIIZZ(aweme);
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            this.LJIIIZ = JHM.LJIIJ(1, aweme);
        }
    }

    public final void LJJIIZ(Aweme aweme) {
        int i;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJL = aweme.getAid();
            this.LJJLI = JHM.LJIIIZ(aweme);
            this.LJJZZIII = C227768wm.LJFF(aweme);
            aweme.isImage();
            this.LJZ = aweme.isForwardAweme() ? 1 : 0;
            this.LJL = aweme.getRepostFromGroupId();
            this.LJLI = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.LJLIL = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LLF = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJLL = AV1.LJIILJJIL(aweme);
            this.LJLLI = C227768wm.LJII(aweme);
            this.LJLLILLLL = C227768wm.LJI(aweme);
            this.LJLLJ = "";
            if (aweme.getVideo() != null) {
                i = aweme.getVideo().getDuration();
            } else {
                i = 0;
            }
            this.LJLJLLL = i;
            this.LJLLL = C227768wm.LJIIIIZZ(aweme);
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            this.LLILZIL = aweme.getHasAd();
            if (TextUtils.isEmpty(this.LJIILLIIL)) {
                this.LJIILLIIL = JHM.LJIIJ(1, aweme);
            }
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LLFFF = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LLIIIILZ = aweme.playlist_info.getMixId();
            }
            if (!((Boolean) C50919Jyd.LIZ.getValue()).booleanValue()) {
                C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LLIIJI = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LLIIJI = 1;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                this.LLIZLLLIL = commerceVideoAuthInfo.getBCHashtag();
            }
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    if (interactStickerStruct.getQaStruct() != null) {
                        this.LLILL = 1;
                        this.LLILLIZIL = Long.valueOf(interactStickerStruct.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(interactStickerStruct.getQaStruct().getItemId()))) {
                            this.LLILIL = "answer";
                            return;
                        } else {
                            this.LLILIL = "question";
                            return;
                        }
                    }
                }
            }
        }
    }
}
