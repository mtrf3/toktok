package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lyi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56020Lyi implements InterfaceC87283bg {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public volatile EnumC55971Lxv LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public EnumC56059LzL LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile String LJLL;
    public volatile String LJLLI;
    public boolean LJLLILLLL;
    public volatile boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public ILR LJLLLLLL;
    public final int LJLZ;
    public String LJZ;

    public C56020Lyi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56020Lyi)) {
            return false;
        }
        C56020Lyi c56020Lyi = (C56020Lyi) obj;
        return this.LJLIL == c56020Lyi.LJLIL && this.LJLILLLLZI == c56020Lyi.LJLILLLLZI && this.LJLJI == c56020Lyi.LJLJI && this.LJLJJI == c56020Lyi.LJLJJI && this.LJLJJL == c56020Lyi.LJLJJL && o.LJ(this.LJLJJLL, c56020Lyi.LJLJJLL) && o.LJ(this.LJLJL, c56020Lyi.LJLJL) && this.LJLJLJ == c56020Lyi.LJLJLJ && this.LJLJLLL == c56020Lyi.LJLJLLL && o.LJ(this.LJLL, c56020Lyi.LJLL) && o.LJ(this.LJLLI, c56020Lyi.LJLLI) && this.LJLLILLLL == c56020Lyi.LJLLILLLL && this.LJLLJ == c56020Lyi.LJLLJ && this.LJLLL == c56020Lyi.LJLLL && this.LJLLLL == c56020Lyi.LJLLLL && this.LJLLLLLL == c56020Lyi.LJLLLLLL && this.LJLZ == c56020Lyi.LJLZ && o.LJ(this.LJZ, c56020Lyi.LJZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LJLIL) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((LLJIJIL + i) * 31) + this.LJLJI) * 31;
        boolean z2 = this.LJLJJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode = (this.LJLJJL.hashCode() + ((i2 + i3) * 31)) * 31;
        String str = this.LJLJJLL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJL;
        int hashCode3 = (this.LJLJLJ.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        boolean z3 = this.LJLJLLL;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int hashCode4 = (((((hashCode3 + i4) * 31) + (this.LJLL == null ? 0 : this.LJLL.hashCode())) * 31) + (this.LJLLI == null ? 0 : this.LJLLI.hashCode())) * 31;
        boolean z4 = this.LJLLILLLL;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        boolean z5 = this.LJLLJ;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z6 = this.LJLLL;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int hashCode5 = (((this.LJLLLLLL.hashCode() + ((((i8 + i9) * 31) + (this.LJLLLL ? 1 : 0)) * 31)) * 31) + this.LJLZ) * 31;
        String str3 = this.LJZ;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MallMainHierarchyData(mForEventOnCreateTime=");
        sb.append(this.LJLIL);
        sb.append(", mForEventHasDoneEnterPage=");
        sb.append(this.LJLILLLLZI);
        sb.append(", mForEventEnterPageType=");
        sb.append(this.LJLJI);
        sb.append(", mForEventHasSendMallPageLoad=");
        sb.append(this.LJLJJI);
        sb.append(", mUserType=");
        sb.append(this.LJLJJL);
        sb.append(", mTopProductId=");
        sb.append(this.LJLJJLL);
        sb.append(", deeplinkSchema=");
        sb.append(this.LJLJL);
        sb.append(", dataFrom=");
        sb.append(this.LJLJLJ);
        sb.append(", isMainDataSuccess=");
        sb.append(this.LJLJLLL);
        sb.append(", mForEventSkinId=");
        sb.append(this.LJLL);
        sb.append(", mCurrentChannelSceneId=");
        sb.append(this.LJLLI);
        sb.append(", mIsDataCache=");
        sb.append(this.LJLLILLLL);
        sb.append(", mForEventHasSendMallPageShow=");
        sb.append(this.LJLLJ);
        sb.append(", isFallbackData=");
        sb.append(this.LJLLL);
        sb.append(", enableSendButtonShow=");
        sb.append(this.LJLLLL);
        sb.append(", loadDataStaus=");
        sb.append(this.LJLLLLLL);
        sb.append(", delayLoadSparkView=");
        sb.append(this.LJLZ);
        sb.append(", openFrom=");
        return C07670Rv.LIZIZ(sb, this.LJZ, ')');
    }

    public C56020Lyi(int i) {
        EnumC55971Lxv mUserType = EnumC55971Lxv.UNKNOWN;
        EnumC56059LzL dataFrom = EnumC56059LzL.PREFETCH;
        ILR loadDataStaus = ILR.UNFAILED;
        o.LJIIIZ(mUserType, "mUserType");
        o.LJIIIZ(dataFrom, "dataFrom");
        o.LJIIIZ(loadDataStaus, "loadDataStaus");
        this.LJLIL = 0L;
        this.LJLILLLLZI = false;
        this.LJLJI = 0;
        this.LJLJJI = false;
        this.LJLJJL = mUserType;
        this.LJLJJLL = null;
        this.LJLJL = null;
        this.LJLJLJ = dataFrom;
        this.LJLJLLL = false;
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLLLLLL = loadDataStaus;
        this.LJLZ = 0;
        this.LJZ = null;
    }

    public final void LIZ(EnumC56059LzL enumC56059LzL) {
        o.LJIIIZ(enumC56059LzL, "<set-?>");
        this.LJLJLJ = enumC56059LzL;
    }
}
