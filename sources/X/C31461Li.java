package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.google.firebase.datatransport.TransportRegistrar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C31461Li implements InterfaceC67209QZh {
    @Override // X.InterfaceC67209QZh
    public Object LIZ(QZO qzo) {
        return TransportRegistrar.LIZ(qzo);
    }

    public static Integer LIZIZ(String str) {
        return Integer.valueOf(CastDoubleProtector.valueOf(str).intValue());
    }

    public static String LIZJ(String str, String str2, String str3) {
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI(str, str2);
        o.LJIIIIZZ(LJI, str3);
        return LJI;
    }

    public static String LIZLLL(StringBuilder sb, UrlModel urlModel, char c, StringBuilder sb2) {
        sb.append(urlModel);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }
}
