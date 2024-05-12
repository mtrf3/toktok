package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZN implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        Object valueOf;
        Object obj = "";
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                valueOf = "";
            } else {
                try {
                    valueOf = Integer.valueOf(i);
                } catch (Throwable unused) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                    return;
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Throwable th) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(componentName.getPackageName());
            LIZ.append("/");
            LIZ.append(componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_component_name", X1D.LIZIZ(LIZ));
            if (i != 0) {
                obj = Integer.valueOf(i);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
            if (C77412UZs.LJFF(context, intent)) {
                context.sendBroadcast(intent);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unable to resolve intent: ");
            LIZ2.append(intent.toString());
            throw new FXW(X1D.LIZIZ(LIZ2));
        }
    }
}
