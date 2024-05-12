package com.bytedance.router;

import X.C16880lQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import java.util.Objects;

/* loaded from: classes7.dex */
public class SmartIntent extends Intent {
    @Override // android.content.Intent
    public Uri getData() {
        return super.getData();
    }

    @Override // android.content.Intent
    public Bundle getExtras() {
        return super.getExtras();
    }

    public SmartIntent(Intent intent) {
        super(intent);
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent == null) {
            return intent;
        }
        if (intent instanceof SmartIntent) {
            return intent;
        }
        return new SmartIntent(intent);
    }

    @Override // android.content.Intent
    public boolean getBooleanExtra(String str, boolean z) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return z;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return z;
        }
        if (LLJJIII instanceof String) {
            try {
                return Boolean.parseBoolean((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        }
        try {
            return ((Boolean) LLJJIII).booleanValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Boolean", Boolean.valueOf(z), e2);
            return z;
        }
    }

    @Override // android.content.Intent
    public byte getByteExtra(String str, byte b) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return b;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return b;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastByteProtector.parseByte((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Byte", Byte.valueOf(b), e);
                return b;
            }
        }
        try {
            return ((Byte) LLJJIII).byteValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Byte", Byte.valueOf(b), e2);
            return b;
        }
    }

    @Override // android.content.Intent
    public char getCharExtra(String str, char c) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return c;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return c;
        }
        if (LLJJIII instanceof String) {
            String str2 = (String) LLJJIII;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, LLJJIII, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) LLJJIII).charValue();
        } catch (ClassCastException e) {
            typeWarning(str, LLJJIII, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    @Override // android.content.Intent
    public double getDoubleExtra(String str, double d) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return d;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return d;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Double", Double.valueOf(d), e);
                return d;
            }
        }
        try {
            return ((Double) LLJJIII).doubleValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Double", Double.valueOf(d), e2);
            return d;
        }
    }

    @Override // android.content.Intent
    public float getFloatExtra(String str, float f) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return f;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return f;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastFloatProtector.parseFloat((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Float", Float.valueOf(f), e);
                return f;
            }
        }
        try {
            return ((Float) LLJJIII).floatValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Float", Float.valueOf(f), e2);
            return f;
        }
    }

    @Override // android.content.Intent
    public int getIntExtra(String str, int i) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return i;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return i;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Integer", Integer.valueOf(i), e);
                return i;
            }
        }
        try {
            return ((Integer) LLJJIII).intValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Integer", Integer.valueOf(i), e2);
            return i;
        }
    }

    @Override // android.content.Intent
    public long getLongExtra(String str, long j) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return j;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return j;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastLongProtector.parseLong((String) LLJJIII);
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Long", Long.valueOf(j), e);
                return j;
            }
        }
        try {
            return ((Long) LLJJIII).longValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Long", Long.valueOf(j), e2);
            return j;
        }
    }

    @Override // android.content.Intent
    public short getShortExtra(String str, short s) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return s;
        }
        Object LLJJIII = C16880lQ.LLJJIII(extras, str);
        if (LLJJIII == null) {
            return s;
        }
        if (LLJJIII instanceof String) {
            try {
                return Short.valueOf(CastShortProtector.parseShort((String) LLJJIII)).shortValue();
            } catch (NumberFormatException e) {
                typeWarning(str, LLJJIII, "Short", Short.valueOf(s), e);
                return s;
            }
        }
        try {
            return ((Short) LLJJIII).shortValue();
        } catch (ClassCastException e2) {
            typeWarning(str, LLJJIII, "Short", Short.valueOf(s), e2);
            return s;
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        obj.getClass();
        Objects.toString(obj2);
    }
}
