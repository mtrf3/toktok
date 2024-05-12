package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C108824Ow;
import X.C109004Po;
import X.C43I;
import X.C4P0;
import X.C4SV;
import X.C61295O3v;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC88471Ynr;
import X.OAH;
import X.ORY;
import X.OSZ;
import X.X1D;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import java.io.File;
import ujb.s;

/* loaded from: classes2.dex */
public class AqS83S1100000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS83S1100000_1(String str, C108824Ow c108824Ow, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c108824Ow;
    }

    public static final Object invoke$0(AqS83S1100000_1 aqS83S1100000_1, Object obj, Object obj2) {
        String str;
        String str2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C61295O3v response = (C61295O3v) obj2;
        o.LJIIIZ(response, "response");
        String filePath = response.getFilePath();
        String str3 = "";
        if (filePath != null && booleanValue && C78685UuP.LJJJZ(filePath)) {
            String str4 = aqS83S1100000_1.s0;
            C4SV.LIZ.getClass();
            String str5 = C4SV.LIZJ;
            if (str5 == null || str5.length() == 0) {
                if (str4.length() > 0) {
                    str = s.LJLZ(filePath, str4, filePath);
                    C4SV.LIZJ = str;
                }
                str = "";
                C4SV.LIZJ = str;
            }
            C4SV.LIZ.getClass();
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(s.LJLZ(filePath, "tiktok_bot_avatar_resource", ""));
                LIZ.append("tiktok_bot_avatar_resource");
                LIZ.append(File.separator);
                str2 = X1D.LIZIZ(LIZ);
            } catch (Exception unused) {
                str2 = "";
            }
            long j = response.LLFFF;
            if (!C4SV.LIZIZ && str2.length() > 0 && j > 0) {
                C4SV.LIZIZ = true;
                OAH.LIZIZ(Long.valueOf(j), str2, false);
            }
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS83S1100000_1.l1;
        if (interfaceC88471Ynr != null) {
            Boolean valueOf = Boolean.valueOf(booleanValue);
            String filePath2 = response.getFilePath();
            if (filePath2 != null) {
                str3 = filePath2;
            }
            interfaceC88471Ynr.invoke(valueOf, str3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS83S1100000_1 aqS83S1100000_1, Object selectSubscribe, Object obj) {
        OSZ osz;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (osz = (OSZ) c43i.LIZ) != null) {
            String str = aqS83S1100000_1.s0;
            SharePanelWidget sharePanelWidget = (SharePanelWidget) aqS83S1100000_1.l1;
            int intValue = ((Number) osz.getFirst()).intValue();
            Object second = osz.getSecond();
            if (ORY.LJJIJIIJIL(Integer.valueOf(intValue), new Integer[]{1, 2, 3, 4}) && o.LJ(second, str)) {
                C109004Po c109004Po = sharePanelWidget.LJLJLJ;
                if (c109004Po != null) {
                    if (c109004Po.getItemCount() > 0) {
                        C109004Po c109004Po2 = sharePanelWidget.LJLJLJ;
                        if (c109004Po2 != null) {
                            c109004Po2.notifyItemChanged(0);
                        } else {
                            o.LJIJI("headAdapter");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("headAdapter");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS83S1100000_1 aqS83S1100000_1, Object selectSubscribe, Object obj) {
        OSZ osz;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (osz = (OSZ) c43i.LIZ) != null) {
            String str = aqS83S1100000_1.s0;
            C108824Ow c108824Ow = (C108824Ow) aqS83S1100000_1.l1;
            int intValue = ((Number) osz.getFirst()).intValue();
            Object second = osz.getSecond();
            if (ORY.LJJIJIIJIL(Integer.valueOf(intValue), new Integer[]{1, 2, 3, 4}) && o.LJ(second, str)) {
                C4P0 c4p0 = c108824Ow.LJLILLLLZI;
                if (c4p0 != null) {
                    if (c4p0.getItemCount() > 0) {
                        C4P0 c4p02 = c108824Ow.LJLILLLLZI;
                        if (c4p02 != null) {
                            c4p02.notifyItemChanged(0);
                        } else {
                            o.LJIJI("avatarAdapter");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("avatarAdapter");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS83S1100000_1(String str, String str2, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        super(2);
        this.$t = interfaceC88471Ynr;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS83S1100000_1(String str, SharePanelWidget sharePanelWidget, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = sharePanelWidget;
    }
}
