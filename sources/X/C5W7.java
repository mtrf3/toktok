package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import fjb.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$3$downloadStickPointResTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {455}, m = "invokeSuspend")
/* renamed from: X.5W7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends List<? extends AVMusic>, ? extends Long>>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Intent LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C34K LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ C43544H7c LJLLI;
    public final /* synthetic */ Intent LJLLILLLL;
    public final /* synthetic */ ArrayList<MediaModel> LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5W7(boolean z, boolean z2, boolean z3, Intent intent, C34K c34k, boolean z4, String str, C34K c34k2, boolean z5, C43544H7c c43544H7c, Intent intent2, ArrayList<MediaModel> arrayList, InterfaceC67352kd<? super C5W7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = intent;
        this.LJLJJLL = c34k;
        this.LJLJL = z4;
        this.LJLJLJ = str;
        this.LJLJLLL = c34k2;
        this.LJLL = z5;
        this.LJLLI = c43544H7c;
        this.LJLLILLLL = intent2;
        this.LJLLJ = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5W7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, interfaceC67352kd);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSJ<Boolean, ? extends List<? extends AVMusic>, Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends List<? extends AVMusic>, ? extends Long>> interfaceC67352kd) {
        return invoke2(interfaceC70422pa, (InterfaceC67352kd<? super OSJ<Boolean, ? extends List<? extends AVMusic>, Long>>) interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List LJJIJ;
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
            if (this.LJLILLLLZI || this.LJLJI || this.LJLJJI) {
                Serializable serializableExtra = this.LJLJJL.getSerializableExtra("aweme_music");
                this.LJLJJLL.element = this.LJLJJL.getBooleanExtra("key_is_music_pre_download_success", false);
                if (this.LJLJJLL.element && serializableExtra != null && (LJJIJ = C47261Igj.LJJIJ(serializableExtra)) != null && (!LJJIJ.isEmpty())) {
                    return new OSJ(Boolean.FALSE, LJJIJ, new Long(0L));
                }
            }
            if (this.LJLJL || C78685UuP.LJJJZ(this.LJLJLJ) || this.LJLJLLL.element) {
                return new OSJ(Boolean.FALSE, null, new Long(0L));
            }
            if (this.LJLL) {
                return new OSJ(Boolean.FALSE, null, new Long(0L));
            }
            if (!C5WB.LIZ()) {
                C43544H7c c43544H7c = this.LJLLI;
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(this.LJLLILLLL, "shoot_way");
                ArrayList<MediaModel> arrayList = this.LJLLJ;
                Intent intent = this.LJLJJL;
                boolean z = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = c43544H7c.LJIIIZ(LLJJIJIIJIL, arrayList, intent, z, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                return new OSJ(Boolean.FALSE, null, new Long(0L));
            }
        }
        return obj;
    }
}
