package X;

import Y.ACallableS104S0100000_1;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.service.experiment.IMTemplateConfigurationSetting;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Usq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78588Usq implements InterfaceC83931Wwp, InterfaceC78595Usx, InterfaceC78568UsW, PRT, InterfaceC04450Fl, InterfaceC48038ItG, BZB, InterfaceC20240qq, C44I {
    public static final C78588Usq LJLIL = new C78588Usq();

    public void LIZIZ(String type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC83931Wwp
    public int LJII() {
        return 0;
    }

    @Override // X.InterfaceC83931Wwp
    public Boolean LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC83931Wwp
    public int[] LJIIJ() {
        return new int[0];
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC04450Fl
    public void LJIIL(long j, String str, String str2) {
    }

    @Override // X.InterfaceC83931Wwp
    public int[] LJIILIIL() {
        return new int[0];
    }

    @Override // X.InterfaceC83931Wwp
    public int[] LJIILL() {
        return new int[0];
    }

    @Override // X.InterfaceC83931Wwp
    public int LJIILLIIL() {
        return R.drawable.aua;
    }

    @Override // X.InterfaceC83931Wwp
    public int[] LJIJ() {
        return null;
    }

    @Override // X.InterfaceC83931Wwp
    public VEDisplaySettings LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJIJJLI() {
        return false;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJJII() {
        return false;
    }

    @Override // X.InterfaceC83931Wwp
    public VEDisplaySettings LJJIII(VESize vESize) {
        return null;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJJIIJ() {
        return false;
    }

    @Override // X.InterfaceC83931Wwp
    public int LJJIIJZLJL() {
        return 10;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJJIIZ() {
        return false;
    }

    @Override // X.InterfaceC83931Wwp
    public boolean LJJIIZI() {
        return false;
    }

    @Override // X.InterfaceC04450Fl
    public void LJJIJ(int i, String str, String str2, long j, JSONObject jSONObject) {
    }

    public int LJJIJIL() {
        return 1;
    }

    public void onStop(String type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.InterfaceC83931Wwp
    public byte LJIIIZ() {
        return EnumC46454ILa.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
    }

    public /* synthetic */ C78588Usq() {
    }

    @Override // X.InterfaceC83931Wwp
    public YZL LIZ() {
        return YZL.AS_CAMERA_LENS_FRONT;
    }

    @Override // X.InterfaceC83931Wwp
    public VECameraSettings.CAMERA_MODE_TYPE LIZLLL() {
        return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
    }

    public /* synthetic */ C78588Usq(int i) {
    }

    @Override // X.BZB
    public Object LIZJ(AbstractC73638SvC abstractC73638SvC) {
        return new C31875Cf9(abstractC73638SvC);
    }

    @Override // X.C44I
    public void LJIIZILJ(C63120Opw c63120Opw) {
        String str;
        java.util.Map<String, String> localExt;
        java.util.Map<String, String> localExt2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("markAuthorSupporterChatLocal: ");
        String str2 = null;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        if (c63120Opw != null && (localExt2 = c63120Opw.getLocalExt()) != null) {
            str2 = localExt2.get("a:s_author_im_supporter");
        }
        LIZ.append(str2);
        C34B.LIZIZ("AuthorSupporterHelper", X1D.LIZIZ(LIZ));
        if (c63120Opw != null && (localExt = c63120Opw.getLocalExt()) != null && o.LJ(C100013wD.LIZJ, c63120Opw.getConversationId()) && !o.LJ("1", localExt.get("a:s_author_im_supporter"))) {
            localExt.put("a:s_author_im_supporter", "1");
        }
    }

    @Override // X.C44I
    public void LJJ(String conversationID) {
        C4XG c4xg;
        o.LJIIIZ(conversationID, "conversationID");
        C4XF c4xf = InterfaceC104994Ad.LIZ;
        c4xf.getClass();
        C39061g6 c39061g6 = c4xf.LIZIZ;
        c39061g6.getClass();
        IMTemplateConfigurationSetting.LIZ.getClass();
        if (!IMTemplateConfigurationSetting.LIZIZ.isRefreshEnabled || (c4xg = (C4XG) ((java.util.Map) c39061g6.LIZJ).get(conversationID)) == null) {
            return;
        }
        c4xg.LIZIZ();
    }

    @Override // X.C44I
    public void LJJI(String conversationID) {
        o.LJIIIZ(conversationID, "conversationID");
        C2U8.LIZ(new C31M());
    }

    @Override // X.InterfaceC78568UsW
    public void LJJIFFI(C78593Usv c78593Usv) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c78593Usv.LIZJ()) {
                break;
            }
            char LIZIZ = c78593Usv.LIZIZ();
            c78593Usv.LJFF++;
            int LJJIJIIJIL = LJJIJIIJIL(LIZIZ, sb);
            int LIZ = c78593Usv.LIZ() + ((sb.length() / 3) << 1);
            c78593Usv.LIZLLL(LIZ);
            int i = c78593Usv.LJII.LIZIZ - LIZ;
            if (!c78593Usv.LIZJ()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - LJJIJIIJIL, length);
                    c78593Usv.LJFF--;
                    LJJIJIIJIL = LJJIJIIJIL(c78593Usv.LIZIZ(), sb2);
                    c78593Usv.LJII = null;
                }
                while (sb.length() % 3 == 1 && (LJJIJIIJIL > 3 || i != 1)) {
                    int length2 = sb.length();
                    sb.delete(length2 - LJJIJIIJIL, length2);
                    c78593Usv.LJFF--;
                    LJJIJIIJIL = LJJIJIIJIL(c78593Usv.LIZIZ(), sb2);
                    c78593Usv.LJII = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (C78939UyV.LJJJI(c78593Usv.LJFF, LJJIJIL(), c78593Usv.LIZ) != LJJIJIL()) {
                    c78593Usv.LJI = 0;
                    break;
                }
            }
        }
        LJJIJL(c78593Usv, sb);
    }

    @Override // X.C44I
    public AbstractC73635Sv9 LJJIJIIJI(List list) {
        if (list == null || list.isEmpty()) {
            C73537StZ c73537StZ = C73537StZ.LJLIL;
            o.LJIIIIZZ(c73537StZ, "empty()");
            return c73537StZ;
        }
        return new CallableC73655SvT(new ACallableS104S0100000_1(list, 10)).LJIIJJI(C32810CuE.LJLILLLLZI).LJIIJ(C38891fp.LJLJJL);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C0NB.LJ(C78591Ust.LIZ, "getDefaultLocation  onErrorResumeNext");
        UIO.LIZIZ("ttlive_wallet_exchange_get_default_location", it);
        DefaultLocationData defaultLocationData = new DefaultLocationData();
        defaultLocationData.LIZ = true;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.otv);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_us_exchange_default_address)");
        defaultLocationData.LIZIZ = LJIILJJIL;
        return AbstractC73638SvC.LJIJ(defaultLocationData);
    }

    public static void LJJIJLIJ(C78593Usv c78593Usv, StringBuilder sb) {
        int charAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        c78593Usv.LJ.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // X.C44I
    public void LJFF(String conversationID, List list) {
        o.LJIIIZ(conversationID, "conversationID");
        o.LJIIIZ(list, "list");
        LJIL(conversationID, list);
        C4XF c4xf = InterfaceC104994Ad.LIZ;
        c4xf.getClass();
        C39061g6 c39061g6 = c4xf.LIZIZ;
        c39061g6.getClass();
        IMTemplateConfigurationSetting.LIZ.getClass();
        if (IMTemplateConfigurationSetting.LIZIZ.isRefreshEnabled) {
            java.util.Map map = (java.util.Map) c39061g6.LIZJ;
            Object obj = map.get(conversationID);
            if (obj == null) {
                obj = new C62853Old(conversationID);
                map.put(conversationID, obj);
            }
            ((C4XG) obj).LIZ(list);
        }
        AnonymousClass489.LIZ.getClass();
        if (list.isEmpty() || !C52550Kjq.LIZ()) {
            return;
        }
        XKX.LIZLLL(AnonymousClass489.LIZIZ, null, null, new C1044948f(conversationID, list, null), 3);
    }

    @Override // X.C44I
    public void LJIJI(SystemContent content, String str) {
        o.LJIIIZ(content, "content");
        C2U8.LIZ(new C42P(content, str));
    }

    @Override // X.C44I
    public void LJIL(String conversationID, List list) {
        o.LJIIIZ(conversationID, "conversationID");
        o.LJIIIZ(list, "list");
        C84973Vd.LJIIIZ(list);
    }

    public int LJJIJIIJIL(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0') {
            if (c <= '9') {
                sb.append((char) ((c - '0') + 4));
                return 1;
            }
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) ((c - 'A') + 14));
                return 1;
            }
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!') {
            if (c <= '/') {
                sb.append((char) 1);
                sb.append((char) (c - '!'));
                return 2;
            }
            if (c >= ':') {
                if (c <= '@') {
                    sb.append((char) 1);
                    sb.append((char) ((c - ':') + 15));
                    return 2;
                }
                if (c >= '[') {
                    if (c <= '_') {
                        sb.append((char) 1);
                        sb.append((char) ((c - '[') + 22));
                        return 2;
                    }
                    if (c >= '`' && c <= 127) {
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                }
            }
        }
        sb.append("\u0001\u001e");
        return LJJIJIIJIL((char) (c - 128), sb) + 2;
    }

    public void LJJIJL(C78593Usv c78593Usv, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int LIZ = c78593Usv.LIZ() + length;
        c78593Usv.LIZLLL(LIZ);
        int i = c78593Usv.LJII.LIZIZ - LIZ;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                LJJIJLIJ(c78593Usv, sb);
            }
            if (c78593Usv.LIZJ()) {
                c78593Usv.LJ((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                LJJIJLIJ(c78593Usv, sb);
            }
            if (c78593Usv.LIZJ()) {
                c78593Usv.LJ((char) 254);
            }
            c78593Usv.LJFF--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                LJJIJLIJ(c78593Usv, sb);
            }
            if (i > 0 || c78593Usv.LIZJ()) {
                c78593Usv.LJ((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c78593Usv.LJI = 0;
    }

    @Override // X.InterfaceC78595Usx
    public byte[] LJIILJJIL(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
