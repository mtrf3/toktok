package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.reedit.EditPostMusicHelper$onEditMusic$1", f = "EditPostMusicHelper.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.2t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72592t5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DialogC25756A8y LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ List<String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72592t5(DialogC25756A8y dialogC25756A8y, Context context, Aweme aweme, String str, String str2, List<String> list, InterfaceC67352kd<? super C72592t5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dialogC25756A8y;
        this.LJLJI = context;
        this.LJLJJI = aweme;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72592t5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            XIA xia = C78613UtF.LIZJ;
            C67152kJ c67152kJ = new C67152kJ(this.LJLJI, this.LJLJL, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(xia, c67152kJ, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List<String> list = (List) obj2;
        V1B.LJLILLLLZI(this.LJLILLLLZI);
        if (list != null) {
            Context context = this.LJLJI;
            Aweme aweme = this.LJLJJI;
            String str2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            if (aid.length() != 0) {
                Bundle LIZ = C0H1.LIZ("shoot_way", str3);
                LIZ.putString("id", aweme.getAid());
                LIZ.putString("enter_method", str2);
                Music music = aweme.getMusic();
                if (music == null || (str = Long.valueOf(music.getId()).toString()) == null) {
                    str = "";
                }
                LIZ.putString("music_id", str);
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    AVExternalServiceImpl.LIZ().openGotoNextService().gotoNextPage(LJJIFFI, false, LIZ, list, new OG9());
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
