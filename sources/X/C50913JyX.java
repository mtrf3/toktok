package X;

import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.GroupIdListStruct;
import java.util.List;

/* renamed from: X.JyX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50913JyX extends JHL<C50913JyX> {
    public String LJJL;
    public String LJJLI;
    public GroupIdListStruct LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public final String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public boolean LJJLIL;
    public boolean LJJLJ;
    public String LJJLJLI;
    public int LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public final int LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public String LJZI;
    public String LJZL;
    public int LL;
    public List<AnchorCommonStruct> LLD;
    public String LLF;
    public String LLFF;
    public String LLFFF;
    public boolean LLFII;
    public String LLFZ;
    public String LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public String LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public String LLIIZ;
    public int LLIL;
    public String LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Boolean LLIZ;
    public Boolean LLIZLLLIL;
    public Long LLJ;
    public int LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public Integer LLJJJIL;
    public Integer LLJJJJ;
    public Integer LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public Integer LLJJL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public Integer LLJL;
    public Integer LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public java.util.Map<String, String> LLJZIJLIL;
    public boolean LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;
    public Integer LLLFZ;
    public Integer LLLI;
    public Integer LLLII;
    public Integer LLLIIII;
    public int LLLIIIIL;

    public C50913JyX() {
        super("video_play");
        this.LJJLIIIJJI = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIIIJJIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIIIJL = "";
        this.LJJLL = 1;
        this.LJLLI = -1;
        this.LLIIIJ = -1;
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = -1;
        this.LLILII = "";
        this.LLILIL = 1;
        this.LLILL = 1;
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = "";
        Boolean bool = Boolean.FALSE;
        this.LLIZ = bool;
        this.LLIZLLLIL = bool;
        this.LLJ = 0L;
        this.LLJILJIL = -1.0f;
        this.LLJILJILJ = "normal";
        this.LLJILLL = "normal";
        this.LLJJ = 0;
        this.LLJJIJI = "";
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        this.LLJJJIL = 0;
        this.LLJJJJ = 0;
        this.LLJJJJJIL = 0;
        this.LLJJJJLIIL = 0;
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLL = false;
        this.LLLFZ = -1;
        this.LLLI = -1;
        this.LLLII = -1;
        this.LLLIIII = -1;
        this.LLLIIIIL = 0;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x09d9  */
    @Override // X.JHM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instructions count: 3390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50913JyX.LJII():void");
    }

    @Override // X.JHL
    public final String LJIJJ() {
        return this.LJJLI;
    }

    public C50913JyX(int i) {
        super("video_play_from_push");
        this.LJJLIIIJJI = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIIIJJIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIIIJL = "";
        this.LJJLL = 1;
        this.LJLLI = -1;
        this.LLIIIJ = -1;
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = -1;
        this.LLILII = "";
        this.LLILIL = 1;
        this.LLILL = 1;
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = "";
        Boolean bool = Boolean.FALSE;
        this.LLIZ = bool;
        this.LLIZLLLIL = bool;
        this.LLJ = 0L;
        this.LLJILJIL = -1.0f;
        this.LLJILJILJ = "normal";
        this.LLJILLL = "normal";
        this.LLJJ = 0;
        this.LLJJIJI = "";
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        this.LLJJJIL = 0;
        this.LLJJJJ = 0;
        this.LLJJJJJIL = 0;
        this.LLJJJJLIIL = 0;
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLL = false;
        this.LLLFZ = -1;
        this.LLLI = -1;
        this.LLLII = -1;
        this.LLLIIII = -1;
        this.LLLIIIIL = 0;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJIIIIZZ(Aweme aweme) {
        super.LJIIIIZZ(aweme);
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            this.LJIIIZ = JHM.LJIIJ(1, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c A[EDGE_INSN: B:38:0x011c->B:39:0x011c BREAK  A[LOOP:0: B:28:0x00e0->B:37:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f A[EDGE_INSN: B:51:0x014f->B:52:0x014f BREAK  A[LOOP:1: B:44:0x013b->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50913JyX.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJJIIZ(int i, Aweme aweme) {
        LJIILL(aweme);
        LJJIIZI(aweme);
        this.LJJIIZ = JHM.LJIIJJI(i, aweme);
        String LJIIJ = JHM.LJIIJ(i, aweme);
        this.LJIILLIIL = LJIIJ;
        if (TextUtils.isEmpty(LJIIJ)) {
            this.LJIILLIIL = JHM.LJIIJ(1, aweme);
        }
        this.LJJLIIIJLJLI = String.valueOf(aweme.getFeedCount());
        if (aweme.getAnchors() != null) {
            this.LLD = aweme.getAnchors();
        }
        if (aweme.isPinnedByArtist()) {
            this.LLJL = 1;
        }
        if (aweme.getIsBehindTheSongVideoType().booleanValue()) {
            this.LLJLIL = 1;
        }
        if (!TextUtils.isEmpty(aweme.transParams)) {
            LIZLLL("trans_params", aweme.transParams);
        }
        if (!TextUtils.isEmpty(aweme.isIntextOccludeTab)) {
            LIZLLL("is_intext_occlude_tab", aweme.isIntextOccludeTab);
        }
        if (!TextUtils.isEmpty(aweme.isIntextOccludeInteraction)) {
            LIZLLL("is_intext_occlude_interaction", aweme.isIntextOccludeInteraction);
        }
        if (!TextUtils.isEmpty(aweme.isIntextOut)) {
            LIZLLL("is_intext_out", aweme.isIntextOut);
        }
        if (!TextUtils.isEmpty(aweme.isIntextOccludeDesc)) {
            LIZLLL("is_intext_occlude_desc", aweme.isIntextOccludeDesc);
        }
        try {
            if (Settings.System.getInt(EF7.LIZIZ().getContentResolver(), "accelerometer_rotation") == 0) {
                this.LJLJL = 0;
            } else {
                this.LJLJL = 1;
            }
        } catch (Throwable unused) {
        }
    }
}
