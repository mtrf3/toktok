package X;

import Y.ARunnableS28S0200000_9;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallCommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeed;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lmv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55289Lmv extends AbstractC51036K1g<Aweme, MallCommonFeedModel> {
    public static final /* synthetic */ int LJLLL = 0;
    public M89 LJLIL;
    public Integer[] LJLILLLLZI;
    public final List<MallFeed> LJLJI = new ArrayList();
    public final List<MallFeed> LJLJJI;
    public final List<Aweme> LJLJJL;
    public final Handler LJLJJLL;
    public MallRacunTabInfo LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        MallCommonFeedModel mallCommonFeedModel = (MallCommonFeedModel) this.mData;
        if ((mallCommonFeedModel == null || !o.LJ(mallCommonFeedModel.getHasMore(), Boolean.TRUE)) && !this.LJLLI) {
            return false;
        }
        return true;
    }

    public C55289Lmv() {
        new LinkedHashMap();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLLL = -1;
        this.LJLL = true;
        this.LJLLI = true;
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return this.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(MallCommonFeedModel mallCommonFeedModel) {
        Message obtainMessage = this.mHandler.obtainMessage(0);
        o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
        MallCommonFeedModel mallCommonFeedModel2 = mallCommonFeedModel;
        if (mallCommonFeedModel == null) {
            mallCommonFeedModel2 = this.mData;
        }
        obtainMessage.obj = mallCommonFeedModel2;
        this.LJLJJLL.post(new ARunnableS28S0200000_9(obtainMessage, this, 3));
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        M89 m89;
        o.LJIIIZ(params, "params");
        if (params.length >= 2) {
            Object obj = params[1];
            if (obj instanceof M89) {
                m89 = (M89) obj;
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C55294Ln0(this, m89, null), 2);
            }
        }
        m89 = null;
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C55294Ln0(this, m89, null), 2);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        M89 m89;
        o.LJIIIZ(params, "params");
        if (params.length >= 2) {
            Object obj = params[1];
            if (obj instanceof M89) {
                m89 = (M89) obj;
                this.LJLL = true;
                this.LJLLI = true;
                this.LJLJLLL = -1;
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C55295Ln1(this, m89, null), 2);
            }
        }
        m89 = null;
        this.LJLL = true;
        this.LJLLI = true;
        this.LJLJLLL = -1;
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C55295Ln1(this, m89, null), 2);
    }

    public final void LJIIJJI(String str, boolean z, boolean z2) {
        String str2;
        MallRacunTabInfo mallRacunTabInfo = this.LJLJL;
        if (mallRacunTabInfo != null) {
            str2 = mallRacunTabInfo.getScene();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2)) {
            if (!z && !z2) {
                this.LJLJLLL = ((ArrayList) this.LJLJJL).size();
            }
            this.LJLL = z;
            return;
        }
        this.LJLLI = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeed> r26, X.M89 r27, boolean r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55289Lmv.LJIIJ(java.util.List, X.M89, boolean, java.lang.String):void");
    }
}
