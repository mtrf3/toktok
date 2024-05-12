package X;

import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sticker.question.QaStickerPresenter$handlerAddYoursClickEvent$1", f = "QaStickerPresenter.kt", l = {96, 100}, m = "invokeSuspend")
/* renamed from: X.8n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221758n5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ QaStruct LJLILLLLZI;
    public final /* synthetic */ C221808nA LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ C223618q5 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221758n5(QaStruct qaStruct, C221808nA c221808nA, float f, float f2, C223618q5 c223618q5, InterfaceC67352kd<? super C221758n5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = qaStruct;
        this.LJLJI = c221808nA;
        this.LJLJJI = f;
        this.LJLJJL = f2;
        this.LJLJJLL = c223618q5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C221758n5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        String str;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            long questionId = this.LJLILLLLZI.getQuestionId();
            this.LJLIL = 1;
            obj2 = c220488l2.LIZ(questionId, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj2;
        String str2 = null;
        if (addYoursStickerStruct == null) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C221768n6 c221768n6 = new C221768n6(this.LJLJJLL, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c221768n6, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        if (C226388uY.LJ()) {
            this.LJLJI.LJIIIIZZ(addYoursStickerStruct, true);
        } else if (this.LJLJI.LJIIIZ(this.LJLJJI, this.LJLJJL)) {
            this.LJLJI.LJIIIIZZ(addYoursStickerStruct, false);
        } else {
            C220488l2 c220488l22 = C220488l2.LIZIZ;
            Context context = this.LJLJI.LJLIL;
            AddYoursTopic LJJIJL = C78915Uy7.LJJIJL(addYoursStickerStruct);
            Aweme aweme = this.LJLJI.LJLJJL;
            User author = aweme.getAuthor();
            if (author != null) {
                num = new Integer(author.getFollowStatus());
            } else {
                num = null;
            }
            List<AddYoursAvatar> userAvatars = addYoursStickerStruct.getUserAvatars();
            C221808nA c221808nA = this.LJLJI;
            C245649kW c245649kW = c221808nA.LJLJJI;
            if (c245649kW == null || (c223778qL2 = c245649kW.LJIIZILJ) == null || (str = c223778qL2.LIZ) == null) {
                str = "";
            }
            Aweme aweme2 = c221808nA.LJLJJL;
            if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null && o.LJ(c223778qL.LIZ, "others_homepage") && aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C219648jg.LIZ(c220488l22, context, LJJIJL, aweme, num, userAvatars, true, str, null, 3, str2, 128);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
