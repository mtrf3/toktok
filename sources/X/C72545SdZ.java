package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.business.base.jira.IOnGetMoreParamsListener;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.firebase.FirebaseCommonRegistrar;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SdZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72545SdZ implements IOnGetMoreParamsListener, InterfaceC48038ItG, InterfaceC67207QZf {
    @Override // com.bytedance.business.base.jira.IOnGetMoreParamsListener
    public List getMoreJIRAParams() {
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, O] */
    public static HashMap LIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return new HashMap();
        }
        HashMap hashMap = (HashMap) dataChannel.kv0(C28426BDq.class);
        if (hashMap == null) {
            ?? hashMap2 = new HashMap();
            ((C32537Cpp) dataChannel.gv0(C28426BDq.class)).LIZ = hashMap2;
            return hashMap2;
        }
        return hashMap;
    }

    @Override // X.InterfaceC67207QZf
    public String LIZIZ(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return FirebaseCommonRegistrar.LIZ(installerPackageName);
        }
        return "";
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseResponse) obj).data;
    }

    public static ArrayList LJ(PdpViewModel pdpViewModel, String str) {
        o.LJIIIZ(pdpViewModel, str);
        return new ArrayList();
    }

    public static void LJFF(DataChannel dataChannel, String str, String str2) {
        HashMap LIZ = LIZ(dataChannel);
        if (!LIZ.containsKey(str)) {
            LIZ.put(str, str2);
        }
    }

    public static String LIZLLL(StringBuilder sb, String str, String str2, StringBuilder sb2) {
        sb.append(str);
        sb.append(System.currentTimeMillis());
        sb.append(str2);
        return X1D.LIZIZ(sb2);
    }

    public static View LIZJ(ViewGroup viewGroup, String str, int i, ViewGroup viewGroup2, boolean z) {
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, str);
        return C27531ArH.LIZ(i, context, viewGroup2, z);
    }
}
