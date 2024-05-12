package X;

import android.text.TextUtils;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7E implements Cloneable, InterfaceC55004LiK {
    public O7J LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public int LJZI;
    public String LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public long LLFFF;
    public int LLFII;
    public O7G LLI;
    public List<String> LLIIII;
    public List<String> LLIIIILZ;
    public int LLIIIL;
    public C39061g6 LLIIIZ;
    public C61418O8o LLIIJI;
    public JSONObject LLIIJLIL;
    public String LLIILII;
    public O8D LLIL;
    public O7V LLILII;
    public String LLILIL;
    public NRO LLILLJJLI;
    public String LLILZIL;
    public C217818gj LLILZLL;
    public String LLIZLLLIL;
    public int LLJIJIL;
    public String LLJILJILJ;
    public long LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final List<O7E> LLFF = new ArrayList();
    public int LLFZ = 0;
    public boolean LLIFFJFJJ = false;
    public int LLII = 0;
    public boolean LLIIIJ = false;
    public int LLIIL = 0;
    public int LLIILZL = 1;
    public int LLIIZ = 0;
    public boolean LLILL = false;
    public int LLILLIZIL = 0;
    public int LLILLL = 0;
    public int LLILZ = 0;
    public int LLIZ = 0;
    public int LLJ = Integer.MAX_VALUE;
    public int LLJI = 0;
    public int LLJILJIL = 0;

    public final boolean LIZLLL() {
        int i;
        long j = this.LJLJJL;
        O7V o7v = this.LLILII;
        if (o7v != null) {
            i = o7v.LJII;
        } else {
            i = 0;
        }
        if (j <= i * 1000) {
            return false;
        }
        return true;
    }

    public final C59760Ncq LJFF() {
        new C59763Nct();
        long j = this.LJLL;
        String str = this.LJLZ;
        String str2 = this.LJZL;
        O83 o83 = new O83();
        o83.LIZ = null;
        o83.LIZIZ = null;
        return new C59760Ncq(j, str, str2, new O82(o83), this.LLJJ, this.LLJJI, this.LLJJIII);
    }

    public final long LJI() {
        return (this.LJLJI * 1000) + (this.LJLJJI * 1000) + this.LJLILLLLZI;
    }

    public final long LJII() {
        return (this.LJLJJI * 1000) + this.LJLILLLLZI;
    }

    public final long LJIIIIZZ() {
        long j = this.LJLJJL;
        long j2 = 1000;
        if (j >= 1000) {
            j2 = 17000;
            if (j <= 17000) {
                return j;
            }
        }
        return j2;
    }

    public final boolean LJIIIZ() {
        if (this.LLIIL == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        if (!TextUtils.isEmpty(this.LJLLILLLL) || !TextUtils.isEmpty(this.LJLLL) || !TextUtils.isEmpty(this.LJZ)) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        if (this.LLIZ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        O7G o7g;
        if (this.LJLL > 0) {
            int i = this.LLFZ;
            if (i != 0 && i != 1) {
                if (i == 2 && (o7g = this.LLI) != null && o7g.LIZJ()) {
                    return true;
                }
            } else {
                O7J o7j = this.LJLIL;
                if (o7j != null && o7j.LIZJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJIILJJIL() {
        if (this.LLFZ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIILL() {
        if (this.LJLJJLL == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C61359O6h.LJJJJ && O77.LJII() != -1) {
            currentTimeMillis = O77.LJII();
        }
        if (currentTimeMillis >= LJII() && currentTimeMillis <= LJI()) {
            return true;
        }
        return false;
    }

    public final Object clone() {
        O7E o7e;
        try {
            o7e = (O7E) super.clone();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (o7e == null) {
            return this;
        }
        return o7e;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SplashAd{mSplashAdImageInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mFetchTime=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mExpireSeconds=");
        LIZ.append(this.LJLJI);
        LIZ.append(", mDisplayAfter=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", mDisplayTimeMs=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", mBannerMode=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", mRepeat=");
        LIZ.append(this.LJZI);
        LIZ.append(", mId=");
        LIZ.append(this.LJLL);
        LIZ.append(", mReqId=");
        LIZ.append(this.LJLLI);
        LIZ.append(", mOpenUrl='");
        Q89.LIZIZ(LIZ, this.LJLLILLLL, '\'', ", mAppOpenUrl='");
        Q89.LIZIZ(LIZ, this.LJLLJ, '\'', ", mMicroAppOpenUrl='");
        Q89.LIZIZ(LIZ, this.LJLLL, '\'', ", mBtnText='");
        Q89.LIZIZ(LIZ, this.LJLLLL, '\'', ", mOpenExtraSize=");
        LIZ.append(this.LJLLLLLL);
        LIZ.append(", mLogExtra='");
        Q89.LIZIZ(LIZ, this.LJLZ, '\'', ", mWebUrl='");
        Q89.LIZIZ(LIZ, this.LJZ, '\'', ", mWebTitle='");
        Q89.LIZIZ(LIZ, this.LJZL, '\'', ", mImageMode=");
        LIZ.append(this.LL);
        LIZ.append(", mClickBtnShow=");
        LIZ.append(this.LLD);
        LIZ.append(", mSkipBtnShow=");
        LIZ.append(this.LLF);
        LIZ.append(", mTimeGapSplash=");
        LIZ.append(this.LLFF);
        LIZ.append(", mSplashId=");
        LIZ.append(this.LLFFF);
        LIZ.append(", mInterceptedFlag=");
        LIZ.append(this.LLFII);
        LIZ.append(", mSplashType=");
        LIZ.append(this.LLFZ);
        LIZ.append(", mSplashVideoInfo=");
        LIZ.append(this.LLI);
        LIZ.append(", mHasCallBack=");
        LIZ.append(this.LLIFFJFJJ);
        LIZ.append(", mSplashAdLoadType=");
        LIZ.append(this.LLII);
        LIZ.append(", mWebUrlList=");
        LIZ.append((Object) null);
        LIZ.append(", mCallbackCode=");
        LIZ.append(this.LJLJL);
        LIZ.append(", mOpenUrlList=");
        LIZ.append((Object) null);
        LIZ.append(", mTrackUrlList=");
        LIZ.append(this.LLIIII);
        LIZ.append(", mClickTrackUrlList=");
        LIZ.append(this.LLIIIILZ);
        LIZ.append(", mIsForbidJump=");
        LIZ.append(this.LLIIIJ);
        LIZ.append(", mOrientation=");
        LIZ.append(this.LLIIIL);
        LIZ.append(", mCanvasInfo=");
        LIZ.append(this.LLIIIZ);
        LIZ.append(", mShareAdInfo=");
        LIZ.append(this.LLIIJI);
        LIZ.append(", mSplashShowType=");
        LIZ.append(this.LLIIL);
        LIZ.append(", mSplashAdId=");
        LIZ.append(this.LLIILII);
        LIZ.append(", mPredownload=");
        LIZ.append(this.LLIILZL);
        LIZ.append(", mMicroPreload=");
        LIZ.append(this.LLIIZ);
        LIZ.append(", mPreloadWeb=");
        return b0.LIZJ(LIZ, this.LLILZ, '}', LIZ);
    }

    @Override // X.InterfaceC55004LiK
    public final int LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC55004LiK
    public final String LIZIZ() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC55004LiK
    public final String LIZJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC55004LiK
    public final long getId() {
        return this.LJLL;
    }

    @Override // X.InterfaceC55004LiK
    public final String getLogExtra() {
        return this.LJLZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O7E) || ((O7E) obj).LJLL != this.LJLL) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(org.json.JSONObject r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O7E.LJ(org.json.JSONObject, long, boolean):void");
    }
}
