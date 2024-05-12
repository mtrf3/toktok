package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent$playAmbientAnimation$2$1", f = "ChatRoomAlphaVideoComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118374kj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLILLLLZI;
    public final /* synthetic */ DataSource LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118374kj(boolean z, ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, DataSource dataSource, String str, String str2, boolean z2, String str3, InterfaceC67352kd<? super C118374kj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = chatRoomAlphaVideoComponent;
        this.LJLJI = dataSource;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = z2;
        this.LJLJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C118374kj(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            this.LJLILLLLZI.LJII();
        }
        this.LJLILLLLZI.LJI(this.LJLJI, false);
        boolean z = this.LJLIL;
        if (z) {
            str = "send";
        } else {
            str = "receive";
        }
        String enterFrom = this.LJLILLLLZI.LJLJJI;
        String language = this.LJLJJI;
        String animationName = this.LJLJJL;
        boolean z2 = this.LJLJJLL;
        if (z) {
            if (z2) {
                str2 = "action_bar";
            } else {
                str2 = "keyword";
            }
        } else {
            str2 = "";
        }
        String str3 = this.LJLJL;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(animationName, "animationName");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("dm_display_animation", C113554cx.LJJL(new OSZ("action", str), new OSZ("enter_from", enterFrom), new OSZ("language", language), new OSZ("animation_name", animationName), new OSZ("send_method", str2), new OSZ("chat_type", str3)));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
