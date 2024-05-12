package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.search.ISearchService;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$refreshIcon$1", f = "TakoAssem.kt", l = {171}, m = "invokeSuspend")
/* renamed from: X.8SB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TakoAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8SB(TakoAssem takoAssem, InterfaceC67352kd<? super C8SB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = takoAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C8SB(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        M89 m89;
        Long l;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct suggestWordStruct;
        List<WordStruct> words;
        WordStruct wordStruct;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C17N.LJJIIJZLJL(this.LJLILLLLZI.getContainerView());
            TakoAssem takoAssem = this.LJLILLLLZI;
            this.LJLIL = 1;
            takoAssem.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C87J(takoAssem, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            TakoAssem takoAssem2 = this.LJLILLLLZI;
            takoAssem2.LLIIIL = true;
            System.currentTimeMillis();
            ISearchService r4 = takoAssem2.r4();
            if (r4 != null) {
                r4.LLJLILLLLZIIL(new AqS185S0100000_3(takoAssem2, 191));
            }
            TakoAssem takoAssem3 = this.LJLILLLLZI;
            ISearchService r42 = takoAssem3.r4();
            if (r42 != null) {
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(takoAssem3)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C51029K0z.LJIILLIIL(takoAssem3)).baseFeedPageParams;
                if (baseFeedPageParams != null) {
                    m89 = baseFeedPageParams.param;
                } else {
                    m89 = null;
                }
                if (r42.LJLIIL(aweme, m89)) {
                    try {
                        C8SE imTakoService = IMService.createIIMServicebyMonsterPlugin(false).getImTakoService();
                        String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(takoAssem3)).getAweme().getAid();
                        if (aid != null) {
                            l = Long.valueOf(CastLongProtector.parseLong(aid));
                        } else {
                            l = null;
                        }
                        CommentSuggestWordList commentSuggestWordList = ((VideoItemParams) C51029K0z.LJIILLIIL(takoAssem3)).getAweme().getCommentSuggestWordList();
                        if (commentSuggestWordList != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null && (suggestWordStruct = (SuggestWordStruct) ORZ.LJLLLL(suggestWords)) != null && (words = suggestWordStruct.getWords()) != null && (wordStruct = (WordStruct) ORZ.LJLLLL(words)) != null) {
                            str = wordStruct.getWord();
                        }
                        imTakoService.LIZIZ(str, l);
                    } catch (Exception unused) {
                    }
                }
            }
        } else {
            TakoAssem takoAssem4 = this.LJLILLLLZI;
            takoAssem4.LLIIIL = false;
            takoAssem4.q4(false);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
