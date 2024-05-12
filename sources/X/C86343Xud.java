package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xud, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86343Xud {
    public Aweme LIZ;
    public LiveRoomStruct LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public final C77554UcA LJII;
    public final C86345Xuf LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final List<String> LJIILIIL;
    public boolean LJIILJJIL;
    public final int LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public SlimRoom.LinkMic LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public IMessageManager LJIL;
    public int LJJ;
    public long LJJI;
    public long LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public boolean LJJIIJZLJL;
    public InterfaceC86351Xul LJJIIZ;
    public boolean LJJIIZI;

    public C86343Xud() {
        this(null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86343Xud)) {
            return false;
        }
        C86343Xud c86343Xud = (C86343Xud) obj;
        return o.LJ(this.LIZ, c86343Xud.LIZ) && o.LJ(this.LIZIZ, c86343Xud.LIZIZ) && o.LJ(this.LIZJ, c86343Xud.LIZJ) && o.LJ(this.LIZLLL, c86343Xud.LIZLLL) && this.LJ == c86343Xud.LJ && this.LJFF == c86343Xud.LJFF && this.LJI == c86343Xud.LJI && o.LJ(this.LJII, c86343Xud.LJII) && o.LJ(this.LJIIIIZZ, c86343Xud.LJIIIIZZ) && this.LJIIIZ == c86343Xud.LJIIIZ && this.LJIIJ == c86343Xud.LJIIJ && this.LJIIJJI == c86343Xud.LJIIJJI && this.LJIIL == c86343Xud.LJIIL && o.LJ(this.LJIILIIL, c86343Xud.LJIILIIL) && this.LJIILJJIL == c86343Xud.LJIILJJIL && this.LJIILL == c86343Xud.LJIILL && this.LJIILLIIL == c86343Xud.LJIILLIIL && this.LJIIZILJ == c86343Xud.LJIIZILJ && o.LJ(this.LJIJ, c86343Xud.LJIJ) && this.LJIJI == c86343Xud.LJIJI && this.LJIJJ == c86343Xud.LJIJJ && this.LJIJJLI == c86343Xud.LJIJJLI && o.LJ(this.LJIL, c86343Xud.LJIL) && this.LJJ == c86343Xud.LJJ && this.LJJI == c86343Xud.LJJI && this.LJJIFFI == c86343Xud.LJJIFFI && o.LJ(this.LJJII, c86343Xud.LJJII) && o.LJ(this.LJJIII, c86343Xud.LJJIII) && o.LJ(this.LJJIIJ, c86343Xud.LJJIIJ) && this.LJJIIJZLJL == c86343Xud.LJJIIJZLJL && o.LJ(this.LJJIIZ, c86343Xud.LJJIIZ) && this.LJJIIZI == c86343Xud.LJJIIZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Aweme aweme = this.LIZ;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = hashCode * 31;
        LiveRoomStruct liveRoomStruct = this.LIZIZ;
        if (liveRoomStruct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = liveRoomStruct.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (i2 + hashCode2) * 31, 31), 31);
        boolean z = this.LJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LJ + i4) * 31;
        boolean z2 = this.LJFF;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int hashCode7 = (this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((((i5 + i6) * 31) + this.LJI) * 31)) * 31)) * 31;
        boolean z3 = this.LJIIIZ;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode7 + i7) * 31;
        boolean z4 = this.LJIIJ;
        int i9 = z4;
        if (z4 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z5 = this.LJIIJJI;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z6 = this.LJIIL;
        int i13 = z6;
        if (z6 != 0) {
            i13 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJIILIIL, (i12 + i13) * 31, 31);
        boolean z7 = this.LJIILJJIL;
        int i14 = z7;
        if (z7 != 0) {
            i14 = 1;
        }
        int i15 = (((LIZIZ + i14) * 31) + this.LJIILL) * 31;
        boolean z8 = this.LJIILLIIL;
        int i16 = z8;
        if (z8 != 0) {
            i16 = 1;
        }
        int i17 = (((i15 + i16) * 31) + this.LJIIZILJ) * 31;
        SlimRoom.LinkMic linkMic = this.LJIJ;
        if (linkMic == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = linkMic.hashCode();
        }
        int i18 = (((((((i17 + hashCode3) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31) + this.LJIJJLI) * 31;
        IMessageManager iMessageManager = this.LJIL;
        if (iMessageManager == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = iMessageManager.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJJIFFI, JBR.LIZJ(this.LJJI, (((i18 + hashCode4) * 31) + this.LJJ) * 31, 31), 31);
        String str = this.LJJII;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJJIII, (LIZJ + hashCode5) * 31, 31);
        String str2 = this.LJJIIJ;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i19 = (LJ2 + hashCode6) * 31;
        boolean z9 = this.LJJIIJZLJL;
        int i20 = z9;
        if (z9 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        InterfaceC86351Xul interfaceC86351Xul = this.LJJIIZ;
        if (interfaceC86351Xul != null) {
            i = interfaceC86351Xul.hashCode();
        }
        int i22 = (i21 + i) * 31;
        if (!this.LJJIIZI) {
            i3 = 0;
        }
        return i22 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewLiveContextData(aweme=");
        sb.append(this.LIZ);
        sb.append(", liveRoomStruct=");
        sb.append(this.LIZIZ);
        sb.append(", enterFromMerge=");
        sb.append(this.LIZJ);
        sb.append(", eventType=");
        sb.append(this.LIZLLL);
        sb.append(", liveAlive=");
        sb.append(this.LJ);
        sb.append(", isSelected=");
        sb.append(this.LJFF);
        sb.append(", positionInFeed=");
        sb.append(this.LJI);
        sb.append(", playerData=");
        sb.append(this.LJII);
        sb.append(", mTimeStamps=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isPlaying=");
        sb.append(this.LJIIIZ);
        sb.append(", enterLive=");
        sb.append(this.LJIIJ);
        sb.append(", isShowBefore=");
        sb.append(this.LJIIJJI);
        sb.append(", isLinkMic=");
        sb.append(this.LJIIL);
        sb.append(", currentStatus=");
        sb.append(this.LJIILIIL);
        sb.append(", needTrackAdPlay=");
        sb.append(this.LJIILJJIL);
        sb.append(", onCheckAliveResult=");
        sb.append(this.LJIILL);
        sb.append(", showSubscribeMaskLayer=");
        sb.append(this.LJIILLIIL);
        sb.append(", programmedLiveABConfig=");
        sb.append(this.LJIIZILJ);
        sb.append(", linkMic=");
        sb.append(this.LJIJ);
        sb.append(", endType=");
        sb.append(this.LJIJI);
        sb.append(", giftEffectStart=");
        sb.append(this.LJIJJ);
        sb.append(", giftEffectFinish=");
        sb.append(this.LJIJJLI);
        sb.append(", messageManager=");
        sb.append(this.LJIL);
        sb.append(", stallCount=");
        sb.append(this.LJJ);
        sb.append(", stallStartTime=");
        sb.append(this.LJJI);
        sb.append(", stallDuration=");
        sb.append(this.LJJIFFI);
        sb.append(", playResolution=");
        sb.append(this.LJJII);
        sb.append(", playSessionId=");
        sb.append(this.LJJIII);
        sb.append(", sessionId=");
        sb.append(this.LJJIIJ);
        sb.append(", hasEnterRoom=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", bitrateCallback=");
        sb.append(this.LJJIIZ);
        sb.append(", isAutoEntering=");
        return C08880Wm.LIZJ(sb, this.LJJIIZI, ')');
    }

    public C86343Xud(String eventType, int i) {
        String enterFromMerge;
        boolean z;
        int i2;
        C77554UcA playerData;
        C86345Xuf mTimeStamps;
        ArrayList currentStatus;
        int i3;
        String playSessionId;
        if ((i & 4) != 0) {
            enterFromMerge = "homepage_hot";
        } else {
            enterFromMerge = null;
        }
        eventType = (i & 8) != 0 ? "homepage_hot" : eventType;
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            playerData = new C77554UcA(0);
        } else {
            playerData = null;
        }
        if ((i & 256) != 0) {
            mTimeStamps = new C86345Xuf();
        } else {
            mTimeStamps = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            currentStatus = new ArrayList();
        } else {
            currentStatus = null;
        }
        boolean z2 = (i & 16384) != 0;
        int i4 = (32768 & i) == 0 ? 0 : -1;
        if ((524288 & i) != 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        if ((i & 134217728) != 0) {
            playSessionId = "";
        } else {
            playSessionId = null;
        }
        o.LJIIIZ(enterFromMerge, "enterFromMerge");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(playerData, "playerData");
        o.LJIIIZ(mTimeStamps, "mTimeStamps");
        o.LJIIIZ(currentStatus, "currentStatus");
        o.LJIIIZ(playSessionId, "playSessionId");
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = enterFromMerge;
        this.LIZLLL = eventType;
        this.LJ = z;
        this.LJFF = false;
        this.LJI = i2;
        this.LJII = playerData;
        this.LJIIIIZZ = mTimeStamps;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = currentStatus;
        this.LJIILJJIL = z2;
        this.LJIILL = i4;
        this.LJIILLIIL = false;
        this.LJIIZILJ = 0;
        this.LJIJ = null;
        this.LJIJI = i3;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = null;
        this.LJJ = 0;
        this.LJJI = 0L;
        this.LJJIFFI = 0L;
        this.LJJII = null;
        this.LJJIII = playSessionId;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = false;
        this.LJJIIZ = null;
        this.LJJIIZI = false;
    }
}
