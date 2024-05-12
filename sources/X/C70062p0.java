package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import kotlin.jvm.internal.o;

/* renamed from: X.2p0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70062p0 extends AbstractC65781Prl implements InterfaceC88474Ynu<android.net.Uri, View, C2047581v, Animatable, C76800UCe> {
    public final /* synthetic */ C85003Vg LJLIL;
    public final /* synthetic */ InterfaceC88473Ynt<String, Integer, Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ ShareAwemeContent LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70062p0(View view, C109544Rq c109544Rq, C85003Vg c85003Vg, ShareAwemeContent shareAwemeContent, InterfaceC88473Ynt interfaceC88473Ynt, boolean z) {
        super(4);
        this.LJLIL = c85003Vg;
        this.LJLILLLLZI = interfaceC88473Ynt;
        this.LJLJI = c109544Rq;
        this.LJLJJI = view;
        this.LJLJJL = shareAwemeContent;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.getClass();
        InterfaceC88473Ynt<String, Integer, Integer, C76800UCe> interfaceC88473Ynt = this.LJLILLLLZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("AwemeCoverManager:MsgCover", 0, 0);
        }
        if (this.LJLJI.getLocalExt().get("feed_video_status_flag") != null && (!o.LJ(r1, CardStruct.IStatusCode.DEFAULT))) {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C69932on(this.LJLJJI, this.LJLJI, this.LJLJJL, null, this.LJLJJLL), 3);
        }
        return C76800UCe.LIZ;
    }
}
