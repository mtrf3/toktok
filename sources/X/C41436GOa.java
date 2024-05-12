package X;

import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$retryGroupTask$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GOa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41436GOa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<GUQ> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41436GOa(List<GUQ> list, String str, ActivityC45651qj activityC45651qj, InterfaceC67352kd<? super C41436GOa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = activityC45651qj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41436GOa(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Iterator<GUQ> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            String str = it.next().LJLJJL.LIZIZ;
            GOV.LIZLLL.remove(str);
            GOV.LJ.remove(str);
        }
        int i = 0;
        for (GUQ guq : this.LJLIL) {
            if (guq.LJLJJL.LIZLLL.LIZIZ() || guq.LJLJJL.LIZLLL.LIZ()) {
                if (i >= 0) {
                    List<GUQ> list = this.LJLIL;
                    List<GUQ> subList = list.subList(i, list.size());
                    String str2 = this.LJLILLLLZI;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(subList, 10));
                    int i2 = 0;
                    for (GUQ guq2 : subList) {
                        int i3 = i2 + 1;
                        StoryGroupPublishModel storyGroupPublishModel = null;
                        if (i2 >= 0) {
                            PublishModel publishModel = guq2.LJLJJL.LIZ;
                            StoryGroupPublishModel storyGroupPublishModel2 = publishModel.storyGroupPublishModel;
                            if (storyGroupPublishModel2 != null) {
                                storyGroupPublishModel = StoryGroupPublishModel.copy$default(storyGroupPublishModel2, null, 0, 0, subList.size(), i2, 7, null);
                            }
                            publishModel.storyGroupPublishModel = storyGroupPublishModel;
                            GUQ LJIIIZ = GUH.LJIIIZ(publishModel);
                            LJIIIZ.LIZ(new C41476GPo(LJIIIZ));
                            String str3 = LJIIIZ.LJLJJL.LIZIZ;
                            GOV.LIZLLL.add(str3);
                            GOV.LJ.put(str3, str2);
                            GUH.LJ(LJIIIZ, false);
                            arrayList.add(LJIIIZ);
                            i2 = i3;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    java.util.Set<String> set = GOV.LJII;
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((GUQ) it2.next()).LJLJJL.LIZ.creationId);
                    }
                    set.addAll(arrayList2);
                    GOV.LIZJ.put(this.LJLILLLLZI, arrayList);
                    GUH.LJJIFFI();
                    C41620GVc.LIZ(this.LJLJI, false, 126);
                }
                return C76800UCe.LIZ;
            }
            i++;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
