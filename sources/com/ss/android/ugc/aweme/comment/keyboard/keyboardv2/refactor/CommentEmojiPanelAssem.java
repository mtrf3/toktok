package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C105244Bc;
import X.C105394Br;
import X.C117654jZ;
import X.C176356w3;
import X.C224748ru;
import X.C2K0;
import X.C55096Ljo;
import X.C71I;
import X.C78886Uxe;
import X.C7EP;
import X.InterfaceC1801475e;
import X.InterfaceC55102Lju;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentEmojiPanelAssem extends UISlotAssem implements InterfaceC1801475e, IKeyboardCommentEmojiAssemAbility, InterfaceC55102Lju {
    public static final C71I LJLL = new Object() { // from class: X.71I
    };
    public C105244Bc LJLJLLL;

    @Override // X.InterfaceC1801475e
    public final void LLLLIIIILLL() {
    }

    @Override // X.InterfaceC1801475e
    public final void Pa(View view, Emoji emoji) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(emoji, "emoji");
    }

    @Override // X.InterfaceC1801475e
    public final boolean Q0(String emojiText) {
        o.LJIIIZ(emojiText, "emojiText");
        return false;
    }

    @Override // X.InterfaceC1801475e
    public final void onEmojiClick(String emojiText, int i, int i2) {
        o.LJIIIZ(emojiText, "emojiText");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1395943517) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cpy;
    }

    public CommentEmojiPanelAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        C224748ru U1;
        View view;
        ViewGroup viewGroup;
        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null && (U1 = LIZ.U1()) != null && (view = getSupervisor().LJLLL) != null && (viewGroup = (ViewGroup) view.findViewById(this.LJLIL)) != null) {
            C117654jZ c117654jZ = new C117654jZ(new EmojiInputViewImplV2(U1, 150, this), viewGroup, this);
            C105394Br c105394Br = c117654jZ.LIZLLL;
            c105394Br.LIZIZ = true;
            c105394Br.LJI = 2;
            int LIZ2 = C7EP.LIZ();
            C105394Br c105394Br2 = c117654jZ.LIZLLL;
            c105394Br2.LJII = LIZ2;
            c105394Br2.LJFF = false;
            C105244Bc c105244Bc = new C105244Bc(c117654jZ.LIZ, c105394Br2, c117654jZ.LIZJ, c117654jZ.LIZIZ);
            this.LJLJLLL = c105244Bc;
            View view2 = c105244Bc.LJLIL;
            if (view2 != null) {
                E3(view2);
            }
        }
        super.onCreateView();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardCommentEmojiAssemAbility
    public final void Da0(int i) {
        C105244Bc c105244Bc = this.LJLJLLL;
        if (c105244Bc != null && i > 0) {
            C78886Uxe.LJJLIIIJ(i, c105244Bc.LJLIL);
        }
    }
}
