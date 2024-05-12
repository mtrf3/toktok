package X;

import android.text.TextUtils;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import fjb.a;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$bind$2", f = "SearchUserViewHolder.kt", l = {505}, m = "invokeSuspend")
/* renamed from: X.Ja8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49400Ja8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchUserViewHolder LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49400Ja8(SearchUserViewHolder searchUserViewHolder, InterfaceC67352kd<? super C49400Ja8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchUserViewHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49400Ja8(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        NextLiveData nextLiveData;
        String str2;
        NextLiveData nextLiveData2;
        String str3;
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
            SearchUserViewHolder searchUserViewHolder = this.LJLILLLLZI;
            String str4 = null;
            if (searchUserViewHolder.LLIILZL) {
                this.LJLIL = 1;
                C239319aJ c239319aJ = searchUserViewHolder.LJLLI;
                if (c239319aJ != null) {
                    c239319aJ.setVisibility(8);
                    User user = searchUserViewHolder.LLFF;
                    if (user != null) {
                        str2 = user.getUid();
                    } else {
                        str2 = null;
                    }
                    boolean equals = TextUtils.equals(str2, ((RBX) HG3.LJIILL()).getCurUserId());
                    if (DYF.LJLJI.LIZLLL() && !equals) {
                        RelationButton relationButton = searchUserViewHolder.LJLLJ;
                        if (relationButton != null) {
                            relationButton.setVisibility(0);
                            if (searchUserViewHolder.LJLLJ != null) {
                                SearchGlobalViewModel M = searchUserViewHolder.M();
                                if (M != null) {
                                    User user2 = searchUserViewHolder.LLFF;
                                    if (user2 != null) {
                                        str3 = user2.getUid();
                                    } else {
                                        str3 = null;
                                    }
                                    Integer kv0 = M.kv0(str3);
                                    if (kv0 != null) {
                                        int intValue = kv0.intValue();
                                        User user3 = searchUserViewHolder.LLFF;
                                        if (user3 != null) {
                                            user3.setFollowStatus(intValue);
                                        }
                                    }
                                }
                                SearchGlobalViewModel M2 = searchUserViewHolder.M();
                                if (M2 != null && (nextLiveData2 = M2.LJLILLLLZI) != null) {
                                    nextLiveData2.removeObserver(searchUserViewHolder.LLIILII);
                                    nextLiveData2.observe(searchUserViewHolder.getActivity(), searchUserViewHolder.LLIILII);
                                }
                                searchUserViewHolder.T();
                                RelationButton relationButton2 = searchUserViewHolder.LJLLJ;
                                if (relationButton2 != null) {
                                    relationButton2.setFollowClickInterceptor(new C49633Jdt(searchUserViewHolder, null));
                                    RelationButton relationButton3 = searchUserViewHolder.LJLLJ;
                                    if (relationButton3 != null) {
                                        relationButton3.setDataChangeListener(new AqS174S0100000_8(searchUserViewHolder, 163));
                                        RelationButton relationButton4 = searchUserViewHolder.LJLLJ;
                                        if (relationButton4 != null) {
                                            relationButton4.setTracker(new AqS158S0100000_8(searchUserViewHolder, 471));
                                        } else {
                                            o.LJIJI("relationBtn");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("relationBtn");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("relationBtn");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("relationBtn");
                                throw null;
                            }
                        } else {
                            o.LJIJI("relationBtn");
                            throw null;
                        }
                    } else {
                        RelationButton relationButton5 = searchUserViewHolder.LJLLJ;
                        if (relationButton5 != null) {
                            relationButton5.setVisibility(8);
                        } else {
                            o.LJIJI("relationBtn");
                            throw null;
                        }
                    }
                    if (C76800UCe.LIZ == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("followButton");
                    throw null;
                }
            } else {
                RelationButton relationButton6 = searchUserViewHolder.LJLLJ;
                if (relationButton6 != null) {
                    relationButton6.setVisibility(8);
                    if (searchUserViewHolder.LJLLI != null) {
                        if (searchUserViewHolder.LLFF != null) {
                            Object value = searchUserViewHolder.LLIIIL.getValue();
                            o.LJIIIIZZ(value, "<get-userService>(...)");
                            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<FollowStatus> LJFF = ((IUserService) value).LJFF();
                            LJFF.removeObserver(searchUserViewHolder);
                            LJFF.observe(searchUserViewHolder.getActivity(), searchUserViewHolder);
                        }
                        User user4 = searchUserViewHolder.LLFF;
                        if (user4 != null) {
                            str = user4.getUid();
                        } else {
                            str = null;
                        }
                        boolean equals2 = TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUserId());
                        if (DYF.LJLJI.LIZLLL() && !equals2) {
                            C239319aJ c239319aJ2 = searchUserViewHolder.LJLLI;
                            if (c239319aJ2 != null) {
                                c239319aJ2.setVisibility(0);
                                C239319aJ c239319aJ3 = searchUserViewHolder.LJLLI;
                                if (c239319aJ3 != null) {
                                    c239319aJ3.setShouldShowMessageText(!C49421JaT.LIZLLL(searchUserViewHolder.LLFF));
                                    C51698KQs c51698KQs = searchUserViewHolder.LLI;
                                    if (c51698KQs != null) {
                                        c51698KQs.LJLJL = new C49630Jdq(searchUserViewHolder);
                                    }
                                    SearchGlobalViewModel M3 = searchUserViewHolder.M();
                                    if (M3 != null) {
                                        User user5 = searchUserViewHolder.LLFF;
                                        if (user5 != null) {
                                            str4 = user5.getUid();
                                        }
                                        Integer kv02 = M3.kv0(str4);
                                        if (kv02 != null) {
                                            int intValue2 = kv02.intValue();
                                            User user6 = searchUserViewHolder.LLFF;
                                            if (user6 != null) {
                                                user6.setFollowStatus(intValue2);
                                            }
                                        }
                                    }
                                    SearchGlobalViewModel M4 = searchUserViewHolder.M();
                                    if (M4 != null && (nextLiveData = M4.LJLILLLLZI) != null) {
                                        nextLiveData.removeObserver(searchUserViewHolder.LLIILII);
                                        nextLiveData.observe(searchUserViewHolder.getActivity(), searchUserViewHolder.LLIILII);
                                    }
                                    C51698KQs c51698KQs2 = searchUserViewHolder.LLI;
                                    if (c51698KQs2 != null) {
                                        c51698KQs2.LIZ(searchUserViewHolder.LLFF);
                                    }
                                } else {
                                    o.LJIJI("followButton");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("followButton");
                                throw null;
                            }
                        } else {
                            C239319aJ c239319aJ4 = searchUserViewHolder.LJLLI;
                            if (c239319aJ4 != null) {
                                c239319aJ4.setVisibility(8);
                            } else {
                                o.LJIJI("followButton");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("followButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("relationBtn");
                    throw null;
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
