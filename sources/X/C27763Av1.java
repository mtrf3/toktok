package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import kotlin.jvm.internal.o;

/* renamed from: X.Av1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27763Av1 extends ASB {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        String str2;
        Context context;
        ContextWrapper contextWrapper;
        String authorUid;
        o.LJIIIZ(v, "v");
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ(this.LJLJJI, "panel_source");
        oszArr[1] = new OSZ(this.LJLJI, "enter_from");
        Aweme aweme = this.LJLILLLLZI;
        String str3 = null;
        if (aweme != null) {
            str3 = aweme.getGroupId();
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ(str3, "group_id");
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null || (str = aweme2.getAuthorUid()) == null) {
            str = "";
        }
        oszArr[3] = new OSZ(str, "author_id");
        oszArr[4] = new OSZ(this.LJLJJL, "status");
        FMX.LJIILL("click_floating_window", oszArr);
        OSZ[] oszArr2 = new OSZ[2];
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 == null || (str2 = aweme3.getGroupId()) == null) {
            str2 = "";
        }
        oszArr2[0] = new OSZ("group_id", str2);
        Aweme aweme4 = this.LJLILLLLZI;
        if (aweme4 != null && (authorUid = aweme4.getAuthorUid()) != null) {
            str4 = authorUid;
        }
        oszArr2[1] = new OSZ("author_id", str4);
        java.util.Map<String, String> LJJL = C113554cx.LJJL(oszArr2);
        Context context2 = v.getContext();
        if (!(context2 instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context2) == null || (context = contextWrapper.getBaseContext()) == null) {
            context = v.getContext();
        }
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            IPipFeedService LJJII = PipServiceImpl.LJJII();
            if (LJJII.LJIIZILJ()) {
                LJJII.LJIIIZ(LJJIFFI, this.LJLJI, LJJL);
            } else {
                LJJII.LIZIZ(LJJIFFI, this.LJLJI, LJJL);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27763Av1(C62435Oet manager, AS3 as3, String str, String str2) {
        super(manager, as3);
        o.LJIIIZ(manager, "manager");
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }
}
