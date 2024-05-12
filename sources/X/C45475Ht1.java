package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45475Ht1 implements InterfaceC45480Ht6 {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public C45632HvY LJ;
    public final ArrayList<MyMediaModel> LJFF;
    public InterfaceC45535Htz LJI;
    public AbstractC45488HtE LJII;
    public AbstractC45488HtE LJIIIIZZ;
    public AbstractC45488HtE LJIIIZ;
    public List<String> LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public ChooseMediaViewModel LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.InterfaceC45480Ht6
    public final void LJFF(int i, int i2) {
    }

    @Override // X.InterfaceC45480Ht6
    public final int LJIIL() {
        return -1;
    }

    @Override // X.InterfaceC45480Ht6
    public final View LJIILJJIL(int i) {
        return null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIILL(boolean z) {
    }

    @Override // X.InterfaceC45480Ht6
    public final C71897SJp LJIILLIIL() {
        return null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.InterfaceC45480Ht6
    public final int LJIJJ(int i, int i2) {
        return 21;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIJJLI(int i) {
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIL(View v, boolean z) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJ(TM0 tm0) {
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJI(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
    }

    @Override // X.InterfaceC45480Ht6
    public final CutSameVideoImageExtraData LJJIFFI() {
        return null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJII(List<MyMediaModel> selectedMedia) {
        o.LJIIIZ(selectedMedia, "selectedMedia");
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJIII() {
    }

    @Override // X.InterfaceC45480Ht6
    public final void onPause() {
    }

    public final void LIZIZ() {
        if (this.LJFF.size() == 1) {
            this.LJIIL = true;
            C45632HvY c45632HvY = this.LJ;
            if (c45632HvY != null) {
                c45632HvY.LIZ(true);
                return;
            } else {
                o.LJIJI("extractMusicView");
                throw null;
            }
        }
        this.LJIIL = false;
        C45632HvY c45632HvY2 = this.LJ;
        if (c45632HvY2 != null) {
            c45632HvY2.LIZ(false);
        } else {
            o.LJIJI("extractMusicView");
            throw null;
        }
    }

    public final void LIZJ() {
        Iterator<MyMediaModel> it = this.LJFF.iterator();
        int i = 1;
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            next.selectIndex = i;
            if (this.LJIILJJIL) {
                next.mediaIndex = i - 1;
            }
            i++;
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final View LJII() {
        C45632HvY c45632HvY = this.LJ;
        if (c45632HvY != null) {
            return c45632HvY.getSureTextView();
        }
        o.LJIJI("extractMusicView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final List<MyMediaModel> LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC45480Ht6
    public final ArrayList<MyMediaModel> LJIIIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC45480Ht6
    public final ArrayList<MyMediaModel> LJIIJ() {
        return this.LJFF;
    }

    public C45475Ht1(Bundle bundle) {
        long j;
        String string;
        String string2;
        String string3;
        String str = "";
        this.LIZ = (bundle == null || (string3 = bundle.getString("creation_id")) == null) ? "" : string3;
        this.LIZIZ = (bundle == null || (string2 = bundle.getString("shoot_way")) == null) ? "" : string2;
        if (bundle != null) {
            j = bundle.getLong("start_time");
        } else {
            j = 0;
        }
        this.LIZJ = j;
        if (bundle != null && (string = bundle.getString("enter_from")) != null) {
            str = string;
        }
        this.LIZLLL = str;
        this.LJFF = new ArrayList<>();
        this.LJIIJ = new ArrayList();
    }

    public final void LIZ(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", this.LIZ);
        c188727au.LJIIIZ("shoot_way", this.LIZIZ);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("in_detail", str);
        FMX.LJIIL("choose_upload_music_content", c188727au.LIZ);
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJ(View view) {
        C45632HvY c45632HvY = (C45632HvY) view;
        this.LJ = c45632HvY;
        c45632HvY.setVisibility(0);
        C45632HvY c45632HvY2 = this.LJ;
        if (c45632HvY2 != null) {
            c45632HvY2.LIZ(false);
            LIZIZ();
            C45632HvY c45632HvY3 = this.LJ;
            if (c45632HvY3 != null) {
                c45632HvY3.setOnExtractClick(new C45478Ht4(this));
                return;
            } else {
                o.LJIJI("extractMusicView");
                throw null;
            }
        }
        o.LJIJI("extractMusicView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIIIZZ(C45472Hsy c45472Hsy) {
        this.LJI = c45472Hsy.LIZIZ;
        this.LJII = c45472Hsy.LJIIJJI;
        this.LJIIIIZZ = c45472Hsy.LJIIL;
        this.LJIIIZ = c45472Hsy.LJIILIIL;
        this.LJIIJ = c45472Hsy.LJIJI;
        C43117Gw5.LIZ.getClass();
        this.LJIIJJI = C43117Gw5.LJII();
        this.LJIILIIL = c45472Hsy.LJIJJLI;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIILIIL(boolean z) {
        if (z) {
            C45632HvY c45632HvY = this.LJ;
            if (c45632HvY != null) {
                c45632HvY.setVisibility(0);
                return;
            } else {
                o.LJIJI("extractMusicView");
                throw null;
            }
        }
        C45632HvY c45632HvY2 = this.LJ;
        if (c45632HvY2 != null) {
            c45632HvY2.setVisibility(8);
        } else {
            o.LJIJI("extractMusicView");
            throw null;
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIJI(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIJJI(View view, String str) {
        C45632HvY c45632HvY = (C45632HvY) view;
        this.LJ = c45632HvY;
        c45632HvY.LIZ(false);
        C45632HvY c45632HvY2 = this.LJ;
        if (c45632HvY2 != null) {
            c45632HvY2.setVisibility(0);
            long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", this.LIZ);
            c188727au.LJIIIZ("shoot_way", this.LIZIZ);
            c188727au.LJIIIZ("enter_from", this.LIZLLL);
            c188727au.LJ(currentTimeMillis, "duration");
            FMX.LJIIL("enter_upload_music_page", c188727au.LIZ);
            return;
        }
        o.LJIJI("extractMusicView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r1 < 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r1 < 0) goto L57;
     */
    @Override // X.InterfaceC45480Ht6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45475Ht1.LJIJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel, boolean, boolean):int");
    }
}
