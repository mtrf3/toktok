package X;

import com.ss.android.ugc.aweme.qna.api.QuestionCategoryStruct;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumCategorySuggestResponse;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$requestCategoryForQuestionText$1", f = "QnaCreationViewModel.kt", l = {225}, m = "invokeSuspend")
/* renamed from: X.4li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118984li extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ QnaCreationViewModel LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118984li(List<String> list, QnaCreationViewModel qnaCreationViewModel, long j, String str, InterfaceC67352kd<? super C118984li> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = qnaCreationViewModel;
        this.LJLJJI = j;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C118984li(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (o.LJ(this.LJLILLLLZI, this.LJLJI.LJZ)) {
                long j = this.LJLJJI;
                this.LJLIL = 1;
                if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        QnaCreationViewModel qnaCreationViewModel = this.LJLJI;
        qnaCreationViewModel.LJZ = this.LJLILLLLZI;
        try {
            C73454SsE LJJJIL = qnaCreationViewModel.LJLIL.LIZIZ.LJJJIL(qnaCreationViewModel.LJLJJLL, qnaCreationViewModel.LJLJL);
            final QnaCreationViewModel qnaCreationViewModel2 = this.LJLJI;
            final String str = this.LJLJJL;
            InterfaceC92693kP LJJJLIIL = LJJJIL.LJJJLIIL(new InterfaceC64592gB() { // from class: X.4lj
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MutableLiveData<java.util.List<X.4lp>>] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj2) {
                    ?? arrayList;
                    String str2;
                    TiktokV1ForumCategorySuggestResponse tiktokV1ForumCategorySuggestResponse = (TiktokV1ForumCategorySuggestResponse) obj2;
                    java.util.Set<String> keySet = QnaCreationViewModel.this.LJLLL.keySet();
                    o.LJIIIIZZ(keySet, "ongoingCategoriesRequests.keys");
                    String str3 = str;
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : keySet) {
                        if (!(!o.LJ(str4, str3))) {
                            break;
                        } else {
                            arrayList2.add(str4);
                        }
                    }
                    QnaCreationViewModel qnaCreationViewModel3 = QnaCreationViewModel.this;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        InterfaceC92693kP remove = qnaCreationViewModel3.LJLLL.remove(it.next());
                        if (remove != null) {
                            remove.dispose();
                        }
                    }
                    QnaCreationViewModel qnaCreationViewModel4 = QnaCreationViewModel.this;
                    qnaCreationViewModel4.LJLLLLLL = str;
                    ?? r5 = qnaCreationViewModel4.LJLJLJ;
                    List<QuestionCategoryStruct> list = tiktokV1ForumCategorySuggestResponse.suggestedCategories;
                    if (list == null) {
                        arrayList = C61878OQg.INSTANCE;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (QuestionCategoryStruct questionCategoryStruct : list) {
                            QuestionCategoryStruct questionCategoryStruct2 = questionCategoryStruct;
                            String str5 = questionCategoryStruct2.categoryName;
                            if (str5 != null && str5.length() != 0 && (str2 = questionCategoryStruct2.id) != null && str2.length() != 0) {
                                arrayList3.add(questionCategoryStruct);
                            }
                        }
                        arrayList = new ArrayList(C32I.LJJL(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            QuestionCategoryStruct questionCategoryStruct3 = (QuestionCategoryStruct) it2.next();
                            String str6 = questionCategoryStruct3.id;
                            String str7 = "";
                            if (str6 == null) {
                                str6 = "";
                            }
                            String str8 = questionCategoryStruct3.categoryName;
                            if (str8 != null) {
                                str7 = str8;
                            }
                            arrayList.add(new C119054lp(str6, str7));
                        }
                    }
                    r5.setValue(arrayList);
                }
            }, new InterfaceC64592gB() { // from class: X.4lm
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj2) {
                    C36922EeM.LJFF((Throwable) obj2);
                }
            });
            qnaCreationViewModel.disposeOnClear(LJJJLIIL);
            QnaCreationViewModel qnaCreationViewModel3 = this.LJLJI;
            String str2 = this.LJLJJL;
            while (qnaCreationViewModel3.LJLLL.size() >= 2) {
                LinkedHashMap<String, InterfaceC92693kP> linkedHashMap = qnaCreationViewModel3.LJLLL;
                java.util.Set<String> keySet = linkedHashMap.keySet();
                o.LJIIIIZZ(keySet, "ongoingCategoriesRequests.keys");
                InterfaceC92693kP remove = linkedHashMap.remove(ORZ.LLF(keySet));
                if (remove != null) {
                    remove.dispose();
                }
            }
            qnaCreationViewModel3.LJLLL.put(str2, LJJJLIIL);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
