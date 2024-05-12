package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.fragment.ShareGroupChatFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.3h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90663h8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.1qj] */
    public static void LIZ(String conversationId, C29S c29s, String str) {
        o.LJIIIZ(conversationId, "conversationId");
        C29S c29s2 = c29s;
        if (c29s == null) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ instanceof C29S) {
                ?? r5 = (ActivityC45651qj) LJIIIIZZ;
                c29s2 = r5;
                if (r5 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        FragmentManager supportFragmentManager = c29s2.getSupportFragmentManager();
        if (supportFragmentManager == null) {
            return;
        }
        ShareGroupChatFragment shareGroupChatFragment = new ShareGroupChatFragment();
        Bundle bundle = new Bundle();
        bundle.putString("conversation_id", conversationId);
        bundle.putString("enter_from", str);
        shareGroupChatFragment.setArguments(bundle);
        TuxSheet tuxSheet = new ASL().LIZ;
        tuxSheet.LJLLILLLL = shareGroupChatFragment;
        tuxSheet.LJLLJ = true;
        tuxSheet.show(supportFragmentManager, "shareGroupInvite");
    }
}
